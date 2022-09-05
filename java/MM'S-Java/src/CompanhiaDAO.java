import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompanhiaDAO {
  Connection conn = null;
  PreparedStatement pstm = null;

  public void saveCompanhia(CompanhiaAerea companhia) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "INSERT INTO companhiaaerea(id,nome)" + "VALUES(?,?)";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      pstm.setInt(1, companhia.getId());
      // Adiciona o valor do primeiro parâmetro da sql
      pstm.setString(2, companhia.getNome());

      System.out.println(pstm);

      // Executa a sql para inserção dos dados
      pstm.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }

  public void removeByid(int id) {

    String sql = "DELETE FROM companhiaaerea where id = ?";

    try {
      conn = Conexao.createConnectionToMySQL();
      // cria conexao

      pstm = conn.prepareStatement(sql);
      // passa o comando sql para o objeto pstm
      pstm.setInt(1, id);
      // seta o id no comando sql
      pstm.execute();
      // executa o comando sql que está no objeto pstm
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }

  public void update(CompanhiaAerea companhia) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "UPDATE companhiaaerea SET id= ?,nome = ?"
        + "WHERE id=?";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      // Adiciona o valor do primeiro parâmetro da sql
      // Adiciona o valor do segundo parâmetro
      pstm.setDouble(1, companhia.getId());
      //
      pstm.setString(2, companhia.getNome());

      //
      pstm.setInt(3, companhia.getId());

      // Executa a sql para inserção dos dados
      pstm.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }
}
