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
public class Casas extends Lugares {

    public Casas() {
    }

    public Casas(String nombre, String direccion, int Seguridad, Carretera Salida) {
        super(nombre, direccion, Seguridad, Salida);
    }

    @Override
    public String toString() {
        return "Casas{" + '}';
    }

}
