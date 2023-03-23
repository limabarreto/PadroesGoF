/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.Cafe;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryCafe implements FactoryBebidas{
    //fff
    @Override
    public Bebida createBebida() {
        return new Cafe();
    }
    
}
