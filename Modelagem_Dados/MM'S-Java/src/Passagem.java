public class Passagem {

  private int id;
  private Cliente user;
  private String partida;
  private String destino;
  private CompanhiaAerea companhia;
  private String valor;

  public Passagem() {
  }

  public void compraPassagem(Cliente cliente, String partida, String destino, CompanhiaAerea companhiaAerea) {

    this.user = cliente;
    this.destino = destino;
    this.partida = partida;
    this.companhia = companhiaAerea;
  }

  public String consulta() {

    return "USUARIO: " + this.user.getNome() + " || " + " Origem:  " + this.partida + " || " + " DESTINO: "
        + this.destino + " || " + "Companhia: " + this.companhia.getNome();
  }
}
