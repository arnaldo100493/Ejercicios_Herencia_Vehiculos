/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Auto extends Vehiculo {

    private int kilometraje;
    private int capacidadEstanque;

    public Auto() {
        super();
        this.kilometraje = 0;
        this.capacidadEstanque = 0;
    }

    public Auto(int kilometraje, int capacidadEstanque) {
        super();
        this.kilometraje = kilometraje;
        this.capacidadEstanque = capacidadEstanque;
    }

    public Auto(String patente, String marca, int anioFabricacion, int kilometraje, int capacidadEstanque) {
        super(patente, marca, anioFabricacion);
        this.kilometraje = kilometraje;
        this.capacidadEstanque = capacidadEstanque;
    }

    public Auto(Vehiculo vehiculo, int kilometraje, int capacidadEstanque) {
        super(vehiculo);
        this.kilometraje = kilometraje;
        this.capacidadEstanque = capacidadEstanque;
    }

    public Auto(Auto auto) {
        super();
        this.kilometraje = auto.getKilometraje();
        this.capacidadEstanque = auto.getCapacidadEstanque();
    }

    @Override
    public String getInformacion() {
        return "[AUTO] " + "Patente: " + this.patente + "[Marca: " + this.marca + "]" + "[Año de Fabricación: " + this.anioFabricacion + "]" + "[Kilometraje: " + this.kilometraje + "]" + "[Capacidad de Estanque: " + this.capacidadEstanque + "]";
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

}
