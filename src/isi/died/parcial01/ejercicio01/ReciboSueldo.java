package isi.died.parcial01.ejercicio01;

public class ReciboSueldo {
	//Atributes
	private Integer nro;
	private Integer mes;
	private Double Total;
	private Empleado empleado;
	
	//Methods and Constructors

	public ReciboSueldo(Integer n, Integer mes, Empleado emp) {
		this.nro = n;
		this.mes = mes;
		this.empleado = emp;
		this.Total = emp.calcularSueldo();
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
