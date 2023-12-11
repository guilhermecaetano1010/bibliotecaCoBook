/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gustavo
 */

/* CÓDIGO DA AULA11 */
public class VisualizadorDeLivros {
    
    private String titulo;
    private Double nota;
    private String autor;



    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public Double getNota() {
        return nota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

    public VisualizadorDeLivros(String titulo,String autor, Double nota) {
        this.titulo = titulo;
        this.autor = autor;
        this.nota = nota;
    }
    
    
}
