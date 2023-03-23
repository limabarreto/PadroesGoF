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
public class Cappuccino extends Bebida {

    public Cappuccino() {
        nome = "Cappuccino";
        descricao = Arrays.asList("Cappuccino, do italiano, pronunciado:\n ou capuchino, geralmente pronunciado: em português, é uma bebida italiana\n preparada com café expresso e leite. ");
        preco = 10.00;
        //ingredientes = new String[]{"500ml de leite, Café, Chocolate, Chantilly"};
        ingredientes = Arrays.asList("500ml de leite\n Café\n Chocolate\n Chantilly");
    }
}
