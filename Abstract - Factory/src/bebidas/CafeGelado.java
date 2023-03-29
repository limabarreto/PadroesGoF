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
public class CafeGelado extends Bebida {

    public CafeGelado() {
        nome = "Café Gelado";
        descricao = Arrays.asList("O café é uma bebida produzidaa partir dos grãos torrados do fruto\n do cafeeiro. É servido tradicionalmente quente, mas também pode ser\n consumido gelado ");
        preco = 5.00;
        //ingredientes = new String[] {"Açucar, Água, 4 colheres de café"};
        ingredientes = Arrays.asList("200ml de água\n 4 colheres de café\n Açucar a gosto");

    }

}
