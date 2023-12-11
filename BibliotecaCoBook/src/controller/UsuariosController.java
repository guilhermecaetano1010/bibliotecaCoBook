/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.ExceptionDAO;
import dao.UsuarioDAO;
import model.Usuario; 


/**
 *
 * @author 819220488
 */
public class UsuariosController {
    
    
    public boolean cadastrar(Usuario usuario) throws ExceptionDAO {
        if(usuario.getNome() == null || usuario.getNome().length() == 0) { //||
                   //&& email != null && email.length()>0  && cpf != null && cpf.length() > 0 && validarCPF(cpf) && idade != null && idade > 0 && sexo != null && sexo.length() > 0 && tipoLivroPreferido1 != null && tipoLivroPreferido1.length() > 0 && tipoLivroPreferido2 != null && tipoLivroPreferido2.length() > 0 && senha != null && senha.length() > 0 && administrador){
            return false;
        }
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuarios(usuario);
        return true;
    }
    
      public boolean validarCPF(String cpf){
            for(int i=0; i < cpf.length(); i++){
                if(!Character.isDigit(cpf.charAt(i))){
                    if(!( i == 3 || i == 7 || i == 11 )){
                    return false;   
                    }   
                }
            }
            return true; 
        }
  
}
