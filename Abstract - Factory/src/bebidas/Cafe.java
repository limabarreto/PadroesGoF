/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

import abstracts.Bebida;
import java.util.Arrays;

/**
 *
 * @author MATHEUS LIMA
 */
public class Cafe extends Bebida {

    public Cafe() {
        nome = "Café";
        descricao = Arrays.asList("O café é uma bebida produzida\n a partir dos grãos torrados\n do fruto do cafeeiro.\n É servido tradicionalmente quente,\n mas também pode ser consumido gelado ");
        preco = 5.00;
        //ingredientes = new String[] {"Açucar, Água, 4 colheres de café"};
        ingredientes = Arrays.asList("200ml de água\n 4 colheres de café\n Açucar a gosto");

    }
}
