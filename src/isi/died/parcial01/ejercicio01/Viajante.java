package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Viajante extends Empleado {
	//Atributes
	private List<Gasto> listaDeGastos;
	private List<Venta> listaDeVentas;
	
	//Methods and Constructors
	public Viajante() {
		listaDeGastos = new ArrayList<Gasto>();
		listaDeVentas = new ArrayList<Venta>();
	}
	
	public Double calcularSueldo() {
		Double bonus=1d;
		
		if(this.calculaAniversario()) bonus=1.5;// Is a bonus.. 50%
		
		return this.sueldoBasico*bonus + this.calcularGastos() + this.calcularVentas()*0.15;
	}
	
	public Double calcularGastos() {
		return this.listaDeGastos.stream().map(g->g.getValorTotal()).collect(Collectors.summingDouble(Double::doubleValue));
	}
	public Double calcularVentas(){
		return this.listaDeVentas.stream().map(v->v.getValorTotal()).collect(Collectors.summingDouble(Double::doubleValue));
	}

}
