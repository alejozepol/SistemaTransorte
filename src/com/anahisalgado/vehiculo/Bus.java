package com.anahisalgado.vehiculo;

import java.util.ArrayList;

public class Bus extends Vehiculo {
		
	private ArrayList<String> estaciones;
	
	public Bus(String matricula, String marca, String modelo, String anio) {
		super(matricula, marca, modelo,anio);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(ArrayList<String> estaciones) {
		this.estaciones = estaciones;
	}

	
	
	
}
