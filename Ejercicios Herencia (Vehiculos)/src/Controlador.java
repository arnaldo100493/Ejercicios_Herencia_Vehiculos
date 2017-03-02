/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Controlador {

    private ListadoVehiculos listadoVehiculos;

    public Controlador() {
        this.listadoVehiculos = new ListadoVehiculos();
    }

    public String agregarAuto(String patente, String marca, int anioFabricacion, int kilometraje, int capacidadEstanque) {
        Vehiculo vehiculo = new Auto(patente, marca, anioFabricacion, kilometraje, capacidadEstanque);
        return this.listadoVehiculos.agregarVehiculo(vehiculo);
    }

    public String agregarCamioneta(String patente, String marca, int anioFabricacion, int capacidadCarga) {
        Vehiculo vehiculo = new Camioneta(patente, marca, anioFabricacion, capacidadCarga);
        return this.listadoVehiculos.agregarVehiculo(vehiculo);
    }

    public String imprimirListadoVehiculosIngresados() {
        return this.listadoVehiculos.imprimirVehiculos();
    }

    public String contarVehiculos() {
        String s = "";
        int contadorAutos = this.listadoVehiculos.contarAutos();
        int contadorCamionetas = this.listadoVehiculos.contarCamionetas();
        int contadorVehiculos = contadorAutos + contadorCamionetas;
        s += "\nCantidad de Autos: " + contadorAutos;
        s += "\nCantidad de Camionetas: " + contadorCamionetas;
        s += "\nTotal: " + contadorVehiculos;
        return s;
    }

}
