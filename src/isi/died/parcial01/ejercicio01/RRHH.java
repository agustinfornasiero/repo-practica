package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class RRHH {
	//Atributes
	private List<ReciboSueldo> recibosDeSueldo;
	
	//Methods and Constructors	
	public List<ReciboSueldo> getRecibosDeSueldos(List<Empleado> emps){
		List<ReciboSueldo> res = new ArrayList<ReciboSueldo>();
		
		for(Empleado e: emps) {
			for(ReciboSueldo r: recibosDeSueldo) {
				if(e.equals(r.getEmpleado())) res.add(r);
			}
		}
		return res;
	}
}
