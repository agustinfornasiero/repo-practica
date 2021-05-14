package isi.died.parcial01.ejercicio02.app;

public class MatCupoLlenoException extends Exception {
	public MatCupoLlenoException() {
		System.out.println("¡ERROR! No puede inscribirse a la materia, cupos insuficientes");
	}
}
