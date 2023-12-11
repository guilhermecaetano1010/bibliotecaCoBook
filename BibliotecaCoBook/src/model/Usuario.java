/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.ExceptionDAO;
import java.util.ArrayList;
import dao.UsuarioDAO;



/**
 *
 * @author Guilherme
 */
public class Usuario {
    private Integer codUsuario;
    private Integer idade;
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String tipoLivroPreferido1;
    private String tipoLivroPreferido2;
    private String senha;
    private ArrayList<Cargos> cargos = new ArrayList<Cargos>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private boolean administrador = false;
    
    public Usuario () {
        
    }
    
    public Usuario(Integer codUsuario,String nome, String email, String cpf, Integer idade, String sexo, String tipoLivroPreferido1, String tipoLivroPreferido2, String senha, boolean administrador){
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.tipoLivroPreferido1 = tipoLivroPreferido1;
        this.tipoLivroPreferido2 = tipoLivroPreferido2;
        this.senha = senha;
        this.administrador = administrador;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoLivroPreferido1() {
        return tipoLivroPreferido1;
    }

    public String getTipoLivroPreferido2() {
        return tipoLivroPreferido2;
    }
    
    public String getSenha() {
    return senha;
    }
    
    public boolean isAdministrador() {
    return administrador;
    }

    public ArrayList<Cargos> getCargos() {
        return cargos;
    }


    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoLivroPreferido1(String tipoLivroPreferido1) {
        this.tipoLivroPreferido1 = tipoLivroPreferido1;
    }

    public void setTipoLivroPreferido2(String tipoLivroPreferido2) {
        this.tipoLivroPreferido2 = tipoLivroPreferido2;
    }
    
    public void setSenha(String senha) {
    this.senha = senha;
    }
    
    public void setAdministrador(boolean administrador) {
    this.administrador = administrador;
    }

    public void setCargos(ArrayList<Cargos> cargos) {
        this.cargos = cargos;
    }


    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    

    
    public void cadastrarUsuarios(Usuario usuarios) throws ExceptionDAO {
        new UsuarioDAO().cadastrarUsuarios(usuarios);
}

}