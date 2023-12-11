/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.ExceptionDAO;
import dao.LivroDAO;

/**
 *
 * @author Guilherme
 */
public class Livro {
    private Integer codLivro;
    private String titulo;
    private String tipoLivro;
    private String autor;
    
    public Livro () {
    }

    public Livro(Integer codLivro, String titulo,String tipoLivro,String autor) {
        this(titulo, tipoLivro, autor);
        this.codLivro = codLivro;
    }


    public Livro(String titulo,String tipoLivro,String autor){
        this.titulo = titulo;
        this.tipoLivro = tipoLivro;
        this.autor = autor;
    }

    public Integer getCodLivro() {
        return codLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipoLivro() {
        return tipoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setCodLivro(Integer codLivro) {
        this.codLivro = codLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipoLivro(String tipoLivro) {
        this.tipoLivro = tipoLivro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
