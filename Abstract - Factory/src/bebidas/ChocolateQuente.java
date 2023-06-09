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
public class ChocolateQuente extends Bebida {

    public ChocolateQuente() {
        nome = "Chocolate Quente";
        descricao = Arrays.asList("O chocolate é um alimento feito com\n base na amêndoa fermentada e torrada\n do cacau."
                + "Sua origem remonta às\n civilizações pré-colombianas\n da América Central.");
        preco = 10.00;
        //ingredientes  = new String[]{"500ml de leite", "5 pedaços de chocolate 60%"};
        ingredientes = Arrays.asList("500ml de leite\n 5 pedaços de chocolate 60%");
    }
}
