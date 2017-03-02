/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public abstract class Vehiculo {

    protected String patente;
    protected String marca;
    protected int anioFabricacion;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.anioFabricacion = 0;
    }

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.patente = vehiculo.getPatente();
        this.marca = vehiculo.getMarca();
        this.anioFabricacion = vehiculo.getAnioFabricacion();
    }

    public abstract String getInformacion();

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

}
