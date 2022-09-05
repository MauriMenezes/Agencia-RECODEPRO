public class Passagem {
  private int id;
  private Cliente user;
  private String partida;
  private String destino;
  private String data_hora;
  private CompanhiaAerea companhia;

  public Passagem() {
  }

  public void compraPassagem(Cliente cliente, String partida, String destino, String data_hora,
      CompanhiaAerea companhiaAerea) {

    this.user = cliente;
    this.destino = destino;
    this.partida = partida;
    this.companhia = companhiaAerea;
    this.data_hora = data_hora;
  }

  public String consulta() {

    return "USUARIO: " + this.user.getNome() + " || " + " Origem:  " + this.partida + " || " + " DESTINO: "
        + this.destino + " || " + "Companhia: " + this.companhia.getNome();
  }

  public Cliente getUser() {
    return this.user;
  }

  public void setUser(Cliente user) {
    this.user = user;
  }

  public String getPartida() {
    return this.partida;
  }

  public void setPartida(String partida) {
    this.partida = partida;
  }

  public String getDestino() {
    return this.destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public String getData_hora() {
    return this.data_hora;
  }

  public void setData_hora(String data_hora) {
    this.data_hora = data_hora;
  }

  public CompanhiaAerea getCompanhia() {
    return this.companhia;
  }

  public void setCompanhia(CompanhiaAerea companhia) {
    this.companhia = companhia;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
