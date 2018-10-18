/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import cuentasBancos.Cuentas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauro.gauto
 */
public class Clientes {
    private String nombre;
    private String apellido;
    private String dni;
    
    
    
    private List<Cuentas> listaCuentas;

    public Clientes(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
        listaCuentas = new ArrayList<Cuentas>();
    }
    
    public void addCuenta(Cuentas cuenta){
           listaCuentas.add(cuenta);
    }

    public List<Cuentas> getListaCuentas() {
        return listaCuentas;
    }


    public void setListaCuentas(List<Cuentas> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", listaCuentas=" + listaCuentas + '}';
    }

  
    
}
