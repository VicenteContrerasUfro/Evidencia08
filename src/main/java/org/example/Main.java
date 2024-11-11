package org.example;

import Evidencia8.Caso1.Bus;
import Evidencia8.Caso1.Empresa;

public class Main {
    public static void main(String[] args) {

        // Crear una nueva empresa
        Empresa empresa = new Empresa("Transportes ABC");

        // Crear y agregar buses
        Bus bus1 = new Bus("B001", "Volvo");
        Bus bus2 = new Bus("B002", "Mercedes");
        empresa.agregarBus(bus1);
        empresa.agregarBus(bus2);

        // Mostrar todos los buses
        System.out.println("\nLista de buses:");
        empresa.mostrarBuses();

        // Actualizar un bus
        empresa.actualizarBus("B001", "Scania");

        // Mostrar buses después de actualización
        System.out.println("\nLista de buses después de actualización:");
        empresa.mostrarBuses();

        // Borrar un bus
        empresa.borrarBus("B002");

        // Mostrar buses después de borrar
        System.out.println("\nLista de buses después de borrar:");
        empresa.mostrarBuses();
    }
}
