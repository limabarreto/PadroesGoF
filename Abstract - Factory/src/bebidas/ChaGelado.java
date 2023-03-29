/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

import abstracts.Bebida;
import java.util.Arrays;

/**
 *
 * @author Matheus
 */
public class ChaGelado extends Bebida {

    public ChaGelado() {
        nome = "Chá Gelado";
        descricao = Arrays.asList("O chá é uma bebida preparada "
                + "através da\n infusão de folhas, flores, raízes \n"
                + "de planta do chá, geralmente preparada\n"
                + "com água quente.");
        preco = 5.00;
        //ingredientes = new String[]{"1 punhado de erva", "300ml de água quente", "açucar a gosto"};
        ingredientes = Arrays.asList("1 punhado de erva\n 300ml de água quente\n Açucar a gosto");
    }
}
