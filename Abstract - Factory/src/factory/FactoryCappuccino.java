/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.CappuccinoGelado;
import bebidas.CappuccinoQuente;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryCappuccino implements FactoryBebidas {

    @Override
    public Bebida hotBebida() {
        return new CappuccinoQuente();
    }

    @Override
    public Bebida coldBebida() {
        return new CappuccinoGelado();
    }
}
