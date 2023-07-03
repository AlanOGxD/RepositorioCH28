package org.generation.controlFlow;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		/*
		 * if (expresion_logica){
		 * }do while( i = 0; i ++)
		if(expresion_logica){
			//ejecuta un bloque de código
		}else if(expresion_logica){
			//ejecuta este bloque de código
		}else{
			//ejecuta este bloque de código
		}
		*/

		//Ejemplo 1
		int time = 22;
		
		if(time >= 6 && time <=12) {
			System.out.println("Es de mañana");
		}else if(time >= 13 && time <=18) {
			System.out.println("Es de tarde");
		}else if(time >= 19 && time <= 23) {
			System.out.println("Es de noche");
		}else if(time >= 0 && time <= 5) {
			System.out.println("Es de madrugada");
		}else {
			System.out.println("Escribe una hora válida");
		}
		
		//Ejemplo 2. Días de la semana: 1. Lunes --- 7. Domingo
		int day = 9;
		
		if(day == 1) {
			System.out.println("Lunes");
		}else if(day == 2) {
			System.out.println("Martes");
		}else if(day == 3) {
			System.out.println("Miércoles");
		}else if(day == 4) {
			System.out.println("Jueves");
		}else if(day == 5) {
			System.out.println("Viernes");
		}else if(day == 6) {
			System.out.println("Sábado");
		}else if(day == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Número de la semana inválido");
		}
		
		/*Java User Input (Scanner)
		 * La clase Scanner se utiliza para obtener la entrada del usuario y se encuentra en el java.util.package.
		 * import java.util.Scanner; De esta manera importamos nuestra clase Scanner desde la JAVA API
		 * */
		
		Scanner scanner = new Scanner(System.in);//Objeto Scanner creado
		System.out.println("Escribe tu nombre de usuario");
		
		String userName = scanner.nextLine();
		
		System.out.println("Escribe tu edad");
		int age = scanner.nextInt();
		
		System.out.println("Tu nombre de usuario es " + userName + " y tu edad es de " + age + " años");
		
		System.out.println("Seleccione un número correspondiente al día de la semana, donde 1 es Lunes hasta 7 es Domingo");
		
		int dia = scanner.nextInt();
		
		if(dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miércoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else if(dia == 6) {
			System.out.println("Sábado");
		}else if(dia == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Número de la semana inválido");
		}
		
		//Switch
		System.out.println("Seleccione un número correspondiente al día de la semana laboral, donde 1 es Lunes hasta 5 es viernes.");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			default:
				System.out.println("Número inválido");
		}
		
		scanner.close();		
	}

}
