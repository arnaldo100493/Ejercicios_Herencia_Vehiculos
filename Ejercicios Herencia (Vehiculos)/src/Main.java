/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("HERENCIA");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controlador controlador = new Controlador();
        menu();
        c.println("Ingrese una opción:");
        int opcion = c.readInt();
        while (opcion != 0) {
            if (opcion == 1) {
                c.clear();
                c.println("Ingrese el tipo de vehículo [1] Auto [2] Camioneta:");
                int tipoVehiculo = c.readInt();

                c.println("Ingrese la patente:");
                String patente = c.readString();

                c.println("Ingrese la marca:");
                String marca = c.readString();

                c.println("Ingrese el año de fabricación:");
                int anioFabricacion = c.readInt();

                if (tipoVehiculo == 1) {
                    c.clear();
                    c.println("Ingrese el kilometraje:");
                    int kilometraje = c.readInt();

                    c.println("Ingrese la capacidad de estanque:");
                    int capacidadEstanque = c.readInt();

                    c.println(controlador.agregarAuto(patente, marca, anioFabricacion, kilometraje, capacidadEstanque));

                }

                if (tipoVehiculo == 2) {
                    c.clear();
                    c.println("Ingrese la capacidad de carga:");
                    int capacidadCarga = c.readInt();

                    c.println(controlador.agregarCamioneta(patente, marca, anioFabricacion, capacidadCarga));

                }

            }

            if (opcion == 2) {
                c.clear();
                c.println(controlador.imprimirListadoVehiculosIngresados());
            }

            if (opcion == 3) {
                c.clear();
            }

            if (opcion == 4) {
                c.clear();
                c.println(controlador.contarVehiculos());
            }

            if (opcion == 5) {
                c.clear();
            }

            c.println("");
            menu();
            c.println("Ingrese una opción:");
            opcion = c.readInt();
        }
        c.close();
    }

    public static void menu() {
        c.println("[1] Ingreso de Vehículos.");
        c.println("[2] Listado de Vehículos Ingresados.");
        c.println("[3] Costo de Reparación [PENDIENTE].");
        c.println("[4] Contar Vehículos.");
        c.println("[0] Salir.");
    }

}
