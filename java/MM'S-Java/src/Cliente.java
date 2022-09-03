public class Cliente {

  private int id;
  private String nome;
  private String Email;

  public Cliente() {
  }

  public Cliente(int id, String nome, String Email) {
    this.id = id;
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

}
