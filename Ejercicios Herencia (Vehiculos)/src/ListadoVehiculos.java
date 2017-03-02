
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class ListadoVehiculos {

    private List<Vehiculo> listadoVehiculos;

    public ListadoVehiculos() {
        this.listadoVehiculos = new LinkedList<>();
    }

    public String agregarVehiculo(Vehiculo vehiculo) {
        this.listadoVehiculos.add(vehiculo);
        return "Ingreso Exitoso.";
    }

    public String imprimirVehiculos() {
        String s = "";
        Iterator<Vehiculo> iterator = this.listadoVehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculo vehiculo = (Vehiculo) iterator.next();
            s += "\n" + vehiculo.getInformacion();
        }
        return s;
    }

    public int contarAutos() {
        int contadorAutos = 0;
        Iterator<Vehiculo> iterator = this.listadoVehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculo vehiculo = (Vehiculo) iterator.next();
            if (vehiculo instanceof Auto) {
                contadorAutos++;
            }
        }
        return contadorAutos;
    }

    public int contarCamionetas() {
        int contadorCamionetas = 0;
        Iterator<Vehiculo> iterator = this.listadoVehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculo vehiculo = (Vehiculo) iterator.next();
            if (vehiculo instanceof Camioneta) {
                contadorCamionetas++;
            }
        }
        return contadorCamionetas;
    }

}
