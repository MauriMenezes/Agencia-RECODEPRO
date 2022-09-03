public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cliente cliente = new Cliente();
        cliente.setEmail("MAURILIOSM25@gmail.com");
        cliente.setNome("MAURILIO");
        cliente.setId(1);
        CompanhiaAerea companhiaAerea = new CompanhiaAerea();
        companhiaAerea.setNome("GOL");
        Passagem compraPassagem = new Passagem();
        compraPassagem.compraPassagem(cliente, "SALVADOR", "SAO-PAULO", companhiaAerea);

        System.out.println(compraPassagem.consulta());
    }
}
