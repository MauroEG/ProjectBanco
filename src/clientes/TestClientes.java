/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import cuentasBancos.CajaAhorro;
import cuentasBancos.CuentaCorriente;


/**
 *
 * @author mauro.gauto
 */
public class TestClientes {
    public static void main(String[] args){
           
            Clientes persona2 = new Clientes("Pancho","Villa","33333342");
            Clientes persona1 = new Clientes("Mauro","Gauto","42175350");
            
            CuentaCorriente c1 = new CuentaCorriente(223, 30000);
            CajaAhorro p2 = new CajaAhorro(223, 30000);
            CajaAhorro p1 = new CajaAhorro(345,2000);
            
            
            persona1.addCuenta(p1);
            persona2.addCuenta(c1);
            persona2.addCuenta(p2);
            
            System.out.println(persona1);
            System.out.println("");
            System.out.println(persona2);
       
            
        
    }
}
