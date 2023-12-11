/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;


/**
 *
 * @author Gustavo
 */
public class UsuarioDAO {
    
    public Usuario obter(String email, String senha) {
        Connection connection = new ConnectionMVC().getConnection();
        try {
            String sql = "select nome,email,cpf,idade,sexo,senha,administrador,cod_usuarios from usuarios where email = ? and senha = ?"; 
            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, email);
            pStatement.setString(2, senha);
            ResultSet rs = pStatement.executeQuery();
            if (rs.next()) {
                String nomeU = rs.getString(1);
                String emailU = rs.getString(2);
                String cpfU = rs.getString(3);
                int idadeU = rs.getInt(4);
                String sexoU = rs.getString(5);
                String senhaU = rs.getString(6);
                boolean administradorU = rs.getBoolean(7);
                int codUsuario = rs.getInt("cod_usuarios");
                return new Usuario(codUsuario, nomeU, emailU, cpfU, idadeU, sexoU, null, null, senhaU, administradorU);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }    
     
    public void cadastrarUsuarios(Usuario usuarios) throws ExceptionDAO {
        String sql = "Insert into usuarios (nome, email, cpf, idade, sexo, tipo_livro_preferido1, tipo_livro_preferido2, senha) values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, usuarios.getNome());
            pStatement.setString(2, usuarios.getEmail());
            pStatement.setString(3, usuarios.getCpf());
            pStatement.setInt(4, usuarios.getIdade());
            pStatement.setString(5, usuarios.getSexo());
            pStatement.setString(6, usuarios.getTipoLivroPreferido1());
            pStatement.setString(7, usuarios.getTipoLivroPreferido2());
            pStatement.setString(8, usuarios.getSenha());
            pStatement.execute();
            
   
        }catch (SQLException e){
            throw new ExceptionDAO ("Erro ao cadastrar Cliente: " + e);
            
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