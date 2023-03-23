/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracts;

import java.util.List;


/**
 *
 * @author MATHEUS LIMA
 */
public abstract class Bebida {
    protected List<String> descricao;
    protected double preco;
    protected List<String> ingredientes;
    protected String nome;
    
   public List<String> getDescricao(){ return descricao;}
   public double getPreco(){return preco;}
   public List<String> getIngredientes(){ return ingredientes;}
   public String getNome(){ return nome;}
   
   
   
    
}
