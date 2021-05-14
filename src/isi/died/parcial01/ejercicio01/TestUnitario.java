package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class TestUnitario {

	//This Class is the main class
	public static void main(String[] args) {
		Empleado e1 = new Operario();
		e1.setSueldoBasico(3000d);
		
		ReciboSueldo r1 = new ReciboSueldo(1,2,e1);
		
		RRHH rrhh=new RRHH();
		List<Empleado> lista = new ArrayList<Empleado>();
		lista.add(e1);
		
		List<ReciboSueldo> Recibos= rrhh.getRecibosDeSueldos(lista);
	}


	}



