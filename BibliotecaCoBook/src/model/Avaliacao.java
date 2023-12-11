/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 819220488
 */
public class Avaliacao {
    private Usuario usuario;    
    private Livro livro;
    private Double nota;

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Double getNota() {
        return nota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Avaliacao(Usuario usuario, Livro livro, Double nota) {
        this.usuario = usuario;
        this.livro = livro;
        this.nota = nota;
    }
    
    
}
