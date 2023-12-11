/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Avaliacao;
/**
 *
 * @author Guilherme
 */
public class AvaliacaoDAO {
    
    public void cadastrar(Avaliacao avaliacao) throws ExceptionDAO {
        String sql = "Insert into avaliacoes (cod_livro, cod_usuarios, nota) values (?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, avaliacao.getLivro().getCodLivro());
            pStatement.setInt(2, avaliacao.getUsuario().getCodUsuario());
            pStatement.setDouble(3, avaliacao.getNota());
            pStatement.execute();
        } catch (SQLException e){
            e.printStackTrace();
            throw new ExceptionDAO ("Erro ao cadastrar Livro: " + e);
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            
            try {
                if (connection != null) {connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
    }
}
}
