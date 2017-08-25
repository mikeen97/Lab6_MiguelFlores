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
public class Restaurantes extends Lugares {

    private String categoria;
    private int calificacion;

    public Restaurantes(String categoria, int calificacion, String nombre, String direccion, int Seguridad, Carretera Salida) {
        super(nombre, direccion, Seguridad, Salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurantes: " + categoria;
    }

}
