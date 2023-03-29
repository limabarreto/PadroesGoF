/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.ChaQuente;
import bebidas.ChaGelado;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryCha implements FactoryBebidas {

    @Override
    public Bebida hotBebida() {
        return new ChaQuente();
    }

    @Override
    public Bebida coldBebida() {
        return new ChaGelado();
    }

}
