package Evidencia8.Caso1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private List<Bus> buses; // Relación de agregación con Bus

	// Constructor
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.buses = new ArrayList<>();
	}

	// Crear un nuevo Bus
	public void agregarBus(Bus bus) {
		buses.add(bus);
		System.out.println("Bus agregado: " + bus);
	}

	// Leer todos los Buses
	public void mostrarBuses() {
		if (buses.isEmpty()) {
			System.out.println("No hay buses en la empresa.");
		} else {
			for (Bus bus : buses) {
				System.out.println(bus);
			}
		}
	}

	// Actualizar un Bus por id
	public void actualizarBus(String idBus, String nuevoModelo) {
		for (Bus bus : buses) {
			if (bus.getIdBus().equals(idBus)) {
				bus.setModelo(nuevoModelo);
				System.out.println("Bus actualizado: " + bus);
				return;
			}
		}
		System.out.println("Bus con id " + idBus + " no encontrado.");
	}

	// Borrar un Bus por id
	public void borrarBus(String idBus) {
		for (Bus bus : buses) {
			if (bus.getIdBus().equals(idBus)) {
				buses.remove(bus);
				System.out.println("Bus borrado: " + bus);
				return;
			}
		}
		System.out.println("Bus con id " + idBus + " no encontrado.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
