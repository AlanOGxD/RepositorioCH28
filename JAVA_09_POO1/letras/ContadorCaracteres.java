package org.generation.letras;

public class ContadorCaracteres {
	//2 tipos de métodos: el primero va a determinar si dentro del texto del usuario hay vocales, consonantes, números o simbolos... el segundo grupo de métodos va a devolver el conteo de dichos caracteres
	
	//Grupo1. Métodos boolean
	public boolean esVocal(char caracter) {
		return(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');
	}
	
	public boolean esNumero(char caracter) {
		short codigoAscii = (short)caracter;
		return codigoAscii >= 48 && codigoAscii <= 57;
	}
	
	public boolean esConsonante(char caracter) {
        short codigoAscii = (short)caracter;
        return(codigoAscii >= 97 && codigoAscii <= 122 && !esVocal(caracter));
	}
	
	public boolean esSimbolo(char caracter) {
		return !(esVocal(caracter) || esNumero(caracter) || esConsonante(caracter));
		
	}	
	
	//Grupo2. El conteo de caracteres
	//Método para contar las vocales
	public int contarVocales(String palabra) {
		int vocales = 0;
		for(char caracter : palabra.toLowerCase().toCharArray()) {//forEach 
			if(esVocal(caracter)) {
				vocales++;
			}
		}
		return vocales;
	}
	
	//Método para contar los números
	public int contarNumeros(String palabra) {
		int numeros = 0;
		for(char caracter : palabra.toCharArray()) {
			if(esNumero(caracter)) {
				numeros++;
			}
		}
		return numeros;
	}
	
	//Método para contar las consonantes
	public int contarConsonantes(String palabra) {
		int consonantes = 0;
		for(char caracter : palabra.toLowerCase().toCharArray()) {
			if(esConsonante(caracter)) {
				consonantes++;
			}
		}
		return consonantes;
	}
	
	//Método para contar las consonantes
	public int contarSimbolos(String palabra) {
		int simbolos = 0;
		for(char caracter : palabra.toLowerCase().toCharArray()) {
			if(esSimbolo(caracter)) {
				simbolos++;
			}
		}
		return simbolos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
