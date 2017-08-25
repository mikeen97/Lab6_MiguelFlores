/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_miguelflores;

import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class Lugares {
    
    private String nombre;
    private String direccion;
    private int Seguridad;
    private ArrayList<Carretera> ListEntradas = new ArrayList();
    private Carretera Salida;
    
    public Lugares() {
    }
    
    public Lugares(String nombre, String direccion, int Seguridad, Carretera Salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Seguridad = Seguridad;
        this.Salida = Salida;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getSeguridad() {
        return Seguridad;
    }
    
    public void setSeguridad(int Seguridad) {
        this.Seguridad = Seguridad;
    }
    
    public ArrayList<Carretera> getListEntradas() {
        return ListEntradas;
    }
    
    public void setListEntradas(Carretera x) {
        ListEntradas.add(x);
    }
    
    public Carretera getSalida() {
        return Salida;
    }
    
    public void setSalida(Carretera Salida) {
        this.Salida = Salida;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
