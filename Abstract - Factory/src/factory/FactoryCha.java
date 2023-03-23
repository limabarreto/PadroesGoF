/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import abstracts.Bebida;
import bebidas.Cha;
import interfaces.FactoryBebidas;

/**
 *
 * @author MATHEUS LIMA
 */
public class FactoryCha implements FactoryBebidas{
    @Override
    public Bebida createBebida() {
        return new Cha();
    }
    
}
