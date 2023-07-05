package org.generation.pOO;

public class Employee {

	//1. Atributos o propiedades
	String nombre;
	String apellido;
	byte edad;
	int id;//Número de empleado
	double salario;
	String direccion;
	String rFC;
		
	//2. Constructor
	public Employee(String nombre, String apellido, byte edad, int id, double salario, String direccion, String rFC) {
		//super();No es necesaria, ya que esta clase no hereda de una superclase.
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = id;
		this.salario = salario;
		this.direccion = direccion;
		this.rFC = rFC;
	}
	
	//3. Métodos de la clase
	public void trabajar() {
		System.out.println("El empleado " + this.nombre + " " + this.apellido + " trabaja de Lunes a Viernes en la sucursal de " + this.direccion);
	}
	
	public void calcularSalario() {
		System.out.println("El salario de " + this.nombre + " " + this.apellido + " es de " + this.salario + " pesito");
	}
	
	public void informarSat() {
		System.out.println("El RFC de " + this.nombre + " " + this.apellido + " es " + this.rFC + ", quítale su 35% de ISPT");
	}


	//4. Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getrFC() {
		return rFC;
	}

	public void setrFC(String rFC) {
		this.rFC = rFC;
	}

	//5. Object toString() utilizando el @Override@Override
	public String toString() {
		return "Employee [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id + ", salario="
				+ salario + ", direccion=" + direccion + ", rFC=" + rFC + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
