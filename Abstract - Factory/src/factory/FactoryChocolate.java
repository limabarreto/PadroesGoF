/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.ChocolateGelado;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryChocolate implements FactoryBebidas {

    @Override
    public Bebida hotBebida() {
        return new ChocolateGelado();
    }

    @Override
    public Bebida coldBebida() {
        return new ChocolateGelado();
    }
}
