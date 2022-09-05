public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente(1, "MAURILIO", "888.888.888-00", "MAURILIOSM25@gmail.com");
        Companhia companhia = new Companhia(1, "GOL");

        Passagem passagem = new Passagem();
        passagem.compraPassagem(cliente, "SALVADOR", "SAO PAULO", "04/09/2022", companhia);
        System.out.println(passagem.consulta());

        // // ADD Cliente no BD
        // ClienteDAO clienteDAO = new ClienteDAO();
        // clienteDAO.saveCliente(cliente);

        // // remove
        // clienteDAO.removeByid(1);

        // // UPDATE
        // clienteDAO.update(cliente);
        // // LIST
        // for (cliente cliente : clienteDAO.getClientes()) {
        // System.out.println(cliente);
        // }
    }
}
