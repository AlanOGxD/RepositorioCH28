package org.generation.letras;

import java.util.Scanner;

public class Lector {
	Scanner scanner = new Scanner(System.in);
	
	//Métodos para mostrar el mensaje solicitado al usuario con un parámetro de tipo String llamado mensaje.
	public void muestraMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	//Método para leer la entrada del usuario, no recibe parámetros y retorna un String.
	public String leeEntrada() {
		return scanner.nextLine();
	}
		
}
