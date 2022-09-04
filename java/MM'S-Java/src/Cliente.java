public class Cliente {

  private int id;
  private String CPF;
  private String nome;
  private String Email;

  public Cliente() {
  }

  public Cliente(int id, String nome, String CPF, String Email) {
    this.id = id;
    this.CPF = CPF;
    this.nome = nome;
    this.Email = Email;

  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  public String getCPF() {
    return this.CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

}
