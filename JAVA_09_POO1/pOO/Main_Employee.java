package org.generation.pOO;

public class Main_Employee {

	public static void main(String[] args) {
		//Instanciando objetos
		Employee empleado1 = new Employee("Daniel", "Maldonado", (byte)36, 6989, 1.50, "Tabasco", "CUMD861208");
		Employee empleado2 = new Employee("Nancy", "Pérez", (byte)24, 542, 39000, "CdMX", "PERN99FB8");
		Employee empleado3 = new Employee("Isaac","Campos", (byte)24, 14, 9852.50, "CDMX", "CARI19990322HDF");
		Employee empleado4 = new Employee("Maria", "Castro", (byte)27, 4205, 35229.54, "Guerrero", "CAMJ9500205");
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		
		//Invocando métodos
		empleado1.calcularSalario();
		empleado2.calcularSalario();
		empleado3.calcularSalario();
		empleado4.calcularSalario();
		
		empleado3.informarSat();
		empleado4.trabajar();
	}

}
