/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasBancos;

import clientes.Clientes;

/**
 *
 * @author mauro.gauto
 */
public class CajaAhorro extends Cuentas{
    private double saldoCA;

public CajaAhorro(int numeroCuenta,double saldoCA) {
        super(numeroCuenta);
        this.saldoCA = saldoCA;
    }

    public double getSaldoCA() {
        return saldoCA;
    }

    public void setSaldoCA(double saldoCA) {
        this.saldoCA = saldoCA;
    }

    @Override
    public String toString() {
        return "CajaAhorro{N°Cuenta:"+numeroCuenta +" saldoCA="+ saldoCA +'}';
    }
    
    
    
    
    
}
