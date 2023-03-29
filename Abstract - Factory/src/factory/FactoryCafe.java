/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.CafeGelado;
import bebidas.CafeQuente;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryCafe implements FactoryBebidas {

    @Override
    public Bebida hotBebida() {
        return new CafeQuente();
    }

    @Override
    public Bebida coldBebida() {
        return new CafeGelado();
    }

    //fff
}
