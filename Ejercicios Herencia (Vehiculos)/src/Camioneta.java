/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Camioneta extends Vehiculo {

    private int capacidadCarga;

    public Camioneta() {
        super();
    }

    public Camioneta(int capacidadCarga) {
        super();
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(String patente, String marca, int anioFabricacion, int capacidadCarga) {
        super(patente, marca, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(Vehiculo vehiculo, int capacidadCarga) {
        super(vehiculo);
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(Camioneta camioneta) {
        super();
        this.capacidadCarga = camioneta.getCapacidadCarga();
    }

    @Override
    public String getInformacion() {
        return "[CAMIONETA] " + "Patente: " + this.patente + "[Marca: " + this.marca + "]" + "[Año de Fabricación: " + this.anioFabricacion + "]" + "[Capacidad de Carga: " + this.capacidadCarga + "]";
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
