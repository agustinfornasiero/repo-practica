package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Empleado {
	//Atributes
	protected Integer CUIL;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaIngreso;
	protected Double sueldoBasico;
	
	//Methods and Constructors
	public abstract Double calcularSueldo();
	public boolean calculaAniversario() {
		return ChronoUnit.DAYS.between(this.fechaIngreso,LocalDate.now())%365 == 0;
	}
	
	
	public void setSueldoBasico(Double s) {
		this.sueldoBasico=s;
	}
}
