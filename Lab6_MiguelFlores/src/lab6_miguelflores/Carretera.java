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
public class Carretera {

    private int numero;
    private double distancia;
    private Lugares inicio;
    private Lugares fin;

    public Carretera() {
    }

    public Carretera(int numero, double distancia, Lugares inicio, Lugares fin) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugares getInicio() {
        return inicio;
    }

    public void setInicio(Lugares inicio) {
        this.inicio = inicio;
    }

    public Lugares getFin() {
        return fin;
    }

    public void setFin(Lugares fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Carretera Nº: "+numero + "";
    }

}
