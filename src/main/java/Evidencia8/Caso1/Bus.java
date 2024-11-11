package Evidencia8.Caso1;

public class Bus {
	private String idBus;
	private String modelo;

	// Constructor
	public Bus(String idBus, String modelo) {
		this.idBus = idBus;
		this.modelo = modelo;
	}

	// Getters and Setters
	public String getIdBus() {
		return idBus;
	}

	public void setIdBus(String idBus) {
		this.idBus = idBus;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Bus{idBus='" + idBus + "', modelo='" + modelo + "'}";
	}
}
