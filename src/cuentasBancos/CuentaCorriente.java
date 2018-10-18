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
public class CuentaCorriente extends Cuentas{
    
    private double saldoCC;
    
    public CuentaCorriente(int numeroCuenta,double saldoCC) {
        super(numeroCuenta);
        this.saldoCC = saldoCC;
    }

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{N°Cuenta:"+ numeroCuenta + " saldoCC=" + saldoCC + '}';
    }
    
    
    
}
