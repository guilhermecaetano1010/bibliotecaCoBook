/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.VisualizadorDeLivros;

/**
 *
 * @author Gustavo
 */






public class VisualizadorDeLivrosTableModel extends AbstractTableModel {
     
    
    private List<VisualizadorDeLivros> dados = new ArrayList<>();
    private String[] colunas = {"Titulo", "Autor", "Nota"};
    
    
    @Override
    public String getColumnName (int column){
        return colunas[column];
    }
    

    @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
   
    }
    /* Adidionado setDados */
      public void setDados(VisualizadorDeLivros[] dados) {
        this.dados = new ArrayList<>();
        for (VisualizadorDeLivros livro : dados) {
            this.dados.add(livro);
        }
        fireTableDataChanged();
    }
      
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getTitulo();
            case 1:
                return dados.get(linha).getAutor();
            case 2:
                return dados.get(linha).getNota();
        }
        
        return null;
        

  
    }
    
    
    
    
   
    /* CÒDIGO DA AULA 11(professor)
public class VisualizadorDeLivrosTableModel extends AbstractTableModel {
    

    @Override
    public int getRowCount() {
       return 3;
    }

    @Override
    public int getColumnCount() {
        return 2;
   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "oi";
    }
    
    public String getColumnName(int col) {
        return(col == 0 ? "titulo" : "nota");
    }
    
}
 
   */
}
