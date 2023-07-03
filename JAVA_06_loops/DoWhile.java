package org.generation.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * La diferencia entre while y do-while es que do-while evalúa su expresión en la parte inferior del bucle. Por lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		 */
		//Cuenta del 1 al 10
		int cuenta = 1;
		do {
			System.out.println("Cuenta es: " + cuenta);
			cuenta++;
		}while(cuenta < 11);

		//Crear un programa que solicite al usuario un número entre 0 y 999 y determine cuántos dígitos tiene. Si elige el 0 muestra cuántos dígitos tiene y finaliza el programa
		
		/*
		 * 1. Importar el Scanner
		 * 2. Interactuar con el usuario (contexto) y solicitar el número
		 * 3. Guardar el número en una variable (int valor)
		 * 4. Ejecutar el bucle. Si el número (valor <= 999 && >= 100): tiene 3 dígitos
		 * 5. valor >= 10: El número tiene 2 dígitos
		 * 6. valor no cumple con las opciones anteriores, tiene un dígito
		 * 7. valor == 0, finalizamos
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número entre 0 y 999 para determinar cuántos dígitos tiene. Si elige 0, finaliza el programa");
		int valor;
		
		do {
			valor = scanner.nextInt();
			if(valor <= 999 && valor >= 100) {
				System.out.println("El número tiene 3 dígitos");
			}else {
				if(valor >= 10) {
					System.out.println("El número tiene 2 dígitos");
				}else {
					System.out.println("El número tiene 1 dígito");
				}
			}
		}while(valor != 0);
		System.out.println("Listo, vuelva pronto");
		
		//Crear un sistema bancario sencillo.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a GenerationBank.");
		System.out.println("Introduzca su número de cliente");
		int numCliente = scanner.nextInt();
		System.out.println("Introduzca su contraseña");
		String password = sc.nextLine();
		
		int opcionSeleccionada;
		
		do {
		System.out.println("Elija una de las siguientes opciones y escriba número de la opción");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Consultar sus ultimos movimientos");
		System.out.println("5. Convertir divisas");
		System.out.println("0. Salir");
		
		opcionSeleccionada = scanner.nextInt();
		switch(opcionSeleccionada) {
		case 1:
			System.out.println("Su saldo es de $500");
			break;
		case 2:
			System.out.println("Ingresando dinero");
			break;
		case 3:
			System.out.println("Retirando dinero");
			break;
		case 4:
			System.out.println("Aquí están sus últimos 5 movimientos");
			break;
		case 5:
			System.out.println("Convirtiendo divisas");
			break;
		case 0:
			System.out.println("Gracias por su visita");
			break;
			default:
				System.out.println("Elija una opción correcta");
				break;
		}
		}while(opcionSeleccionada != 0);
		
		scanner.close();
		sc.close();
	}

}
