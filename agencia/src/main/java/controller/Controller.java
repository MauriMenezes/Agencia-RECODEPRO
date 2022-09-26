package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Conexao;
import model.Cliente;
import model.ClienteDAO;

@WebServlet(urlPatterns =  {"/Controller","/main","/verify"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Conexao con = new Conexao();
	Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO();
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getServletPath();
		
		if(action.equals("/main")) {	
			newClient(request,response);
		}else if (action.equals("/verify")) {
			verifyClient(request,response);
		}
		
		
		 System.out.println(action);
	}
	protected void newClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setando as variaveis cliente
		cliente.setNome(request.getParameter("nome"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setCPF(request.getParameter("cpf"));
		cliente.setSenha(request.getParameter("senha"));
		cliente.setSexo(request.getParameter("inlineRadioOptions"));
		///
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCPF());
		System.out.println(cliente.getSenha());
		
		
		
		clienteDAO.saveCliente(cliente);	
		response.sendRedirect("index.html");
	}
	protected void verifyClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO clienteDAO = new ClienteDAO();
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");	
		//System.out.println(email);
		//System.out.println(senha);
		
		for(Cliente cliente:clienteDAO.getClientes(email)) {
		
			if(cliente.getEmail().equals(email)  && cliente.getSenha().equals(senha)) {

				System.out.println("Login efetuado com sucesso");
				response.sendRedirect("index.html");
			}else {
				System.out.println("Login nao efetuado");
				response.sendRedirect("Pages/login.html");
			}
		}
		
		
	}

}
