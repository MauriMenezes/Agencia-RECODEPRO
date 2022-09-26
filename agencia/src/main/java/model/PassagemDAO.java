package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PassagemDAO {
  Connection conn = null;
  PreparedStatement pstm = null;

  public void savePassagem(Passagem passagem) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "INSERT INTO passagem(origem,destino,id_cliente,id_companhia)" + "VALUES(?,?,?,?)";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      pstm.setString(1, passagem.getPartida());
      // Adiciona o valor do primeiro parâmetro da sql
      pstm.setString(2, passagem.getDestino());
      pstm.setInt(3, passagem.getUser().getId());
      // Adicionar o valor do segundo parâmetro da sql
      pstm.setInt(4, passagem.getCompanhia().getId());
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

    String sql = "DELETE  FROM passagem where id = ?";

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

  public void update(Passagem passagem) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "UPDATE passagem SET origem= ?,destino = ?,id_companhia = ?"
        + "WHERE id=?";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      // Adiciona o valor do primeiro parâmetro da sql
      // Adiciona o valor do segundo parâmetro
      pstm.setString(1, passagem.getPartida());
      //
      pstm.setString(2, passagem.getDestino());
      //
      pstm.setInt(3, passagem.getCompanhia().getId());
      //
      pstm.setInt(4, passagem.getId());

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
