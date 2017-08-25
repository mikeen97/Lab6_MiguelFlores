/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_miguelflores;

/**
 *
 * @author Miguel Flores
 */
public class Canchas extends Lugares {

    private String categoria;
    private String estado;

    public Canchas() {
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int Seguridad, Carretera Salida) {
        super(nombre, direccion, Seguridad, Salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Canchas{" + "categoria=" + categoria + ", estado=" + estado + '}';
    }


    
    
    
}
