/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Livro;
import java.sql.ResultSet;
/**
 *
 * @author Guilherme
 */
public class LivroDAO {
    public void cadastrarLivro(Livro livro) throws ExceptionDAO {
        if (!livroJaCadastrado(livro.getTitulo())) {
        String sql = "Insert into livro (titulo, tipo_livro, autor) values (?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, livro.getTitulo());
            pStatement.setString(2, livro.getTipoLivro());
            pStatement.setString(3, livro.getAutor());
            pStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDAO ("Erro ao cadastrar Livro: " + e);
        } finally {
            try{
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
      }
   }
    
    private boolean livroJaCadastrado(String titulo) throws ExceptionDAO {
        String sql = "SELECT * FROM livro WHERE titulo = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, titulo);

            ResultSet resultSet = pStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDAO ("Erro ao cadastrar Livro: " + e);
        } finally {
            try{
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
        }     
    
    
 
    
    
    public Livro consultarLivro(String tituloProcura) throws ExceptionDAO {
        String sql = "select cod_livro, titulo, tipo_livro, autor from livro where titulo = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, tituloProcura);
            ResultSet result = pStatement.executeQuery();
            if (result.next()) {
                Integer codigo = result.getInt("cod_livro");
                String titulo = result.getString("titulo");
                String tipo_livro = result.getString("tipo_livro");
                String autor = result.getString("autor");
                return new Livro(codigo, titulo, tipo_livro, autor);
            }
            return new Livro();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDAO ("Erro ao cadastrar Livro: " + e);
        } finally {
            try{
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
        
    }
}
