/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.AvaliacaoDAO;
import dao.ExceptionDAO;
import dao.LivroDAO;
import model.Avaliacao;
import model.Livro;
import model.Usuario;

/**
 *
 * @author Gustavo
 */
public class LivroController {
    
    public boolean cadastrarLivro(Usuario usuario, Livro livro, Double nota) throws ExceptionDAO{
        String titulo = livro.getTitulo();
        String tipoLivro = livro.getTipoLivro();
        String autor = livro.getAutor();
        if (titulo != null && titulo.length() > 0 && tipoLivro != null && tipoLivro.length() > 0 &&  autor != null && autor.length() > 0 && nota != null && nota >= 0 && nota <= 10){
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.cadastrarLivro(livro);
            livro = livroDAO.consultarLivro(titulo);
            Avaliacao avaliacao = new Avaliacao(usuario, livro, nota);
            AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
            avaliacaoDAO.cadastrar(avaliacao);
            return true;
        }
        return false;
    }

 }