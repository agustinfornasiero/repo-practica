package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Operario extends Empleado {
	//Atributes
	private List<Viajante> viajantesQueAtiende;

	//Methods and Constructors
	public Operario() {
		viajantesQueAtiende = new ArrayList<Viajante>();
	}

	@Override
	public Double calcularSueldo() {
		Double bonus=1d;
		
		if(this.calculaAniversario()) bonus=1.5; // Is a bonus.. 50%
		
		return this.sueldoBasico*bonus + 0.05*this.ventasDeViajantesAtendidos(); 
	}
	
	public Double ventasDeViajantesAtendidos() {
		return this.viajantesQueAtiende.stream().map(v->v.calcularVentas()).collect(Collectors.summingDouble(Double::doubleValue));
	}
}
