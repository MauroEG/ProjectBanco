/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasBancos;


/**
 *
 * @author mauro.gauto
 */
public abstract class Cuentas {

    protected int numeroCuenta;
   

        public Cuentas(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "numeroCuenta=" + numeroCuenta + '}';
    }

    
    
}
