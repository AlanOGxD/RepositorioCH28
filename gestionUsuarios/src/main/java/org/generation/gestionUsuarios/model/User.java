package org.generation.gestionUsuarios.model;

public class User {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private long telefono;
	
	//Método para imprimir información
	public void imprimirInfo() {
		System.out.println("id: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Dirección: " + direccion);
		System.out.println("email: " + email);
		System.out.println("Teléfono: " + telefono);
	}

	public User(int id, String nombre, String apellido, String direccion, String email, long telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
}
