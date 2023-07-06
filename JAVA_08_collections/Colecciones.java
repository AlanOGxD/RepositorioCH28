package org.gen.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		// Arrays
		String[] films = {"Barbie", "Moana", "Sirenita", "Mulan", "Smile", "Toy Story", "Spider-man"};
		
		// Modificar elementos
		films[4] = "IT";

		// System.out.println(films[4]);
		
		// Reservar la memoria para despues utilizarla
		// 50 elementos
		String[] films2 = new String[10];
		
		// Imprimir todo el Array
		// Arrays es una utilidad externa que tiene un metodo toString.
		// toString parsea el array de parametro a un String legible para la consola o el resto del programa
		// System.out.println(Arrays.toString(films));
		
		
		
		
		/////////////////////////////////////////////////////////////
		// ArrayList
		// Cambiar de tamaño
		
		ArrayList<String> series = new ArrayList<String>();
		
		// Agregar datos
		series.add("Malcom");
		series.add("Black Mirror");
		series.add("Incognito");
		series.add("Game of Thrones");
		series.add("Avatar");
		series.add("Kimetsu");
		
		// Obtener por indice
		//System.out.println(series.get(5));
		
		//Modificar elementos
		series.set(3, "Fleabag");
		
		// Eliminar datos
		series.remove(2);
		
		// Limpia todo el ArrayList
		//series.clear();
		
		// Longitud / tamaño
		int arrayListSize = series.size();
		
		//System.out.println(arrayListSize);
		
		// Iterar sobre un arrayList
		for (int i = 0; i < series.size(); i++) {
			//System.out.println(series.get(i));
		}
		
		// For each
		for(String serie : series) {
			//System.out.println(serie);
		}
		
		// Colleactions > sort
		// Ordena el ArrayList
		Collections.sort(series);
//		System.out.println(series);
		
		ArrayList<Integer> calif = new ArrayList<Integer>(); 
		
		calif.add(80);
		calif.add(100);
		calif.add(90);
		calif.add(95);
//		System.out.println(calif);
		Collections.sort(calif);
//		System.out.println(calif);
		
		
		
		////////////////////////////////////////////////////////////////
		// Set HashSet
		// 
		
		Set<String> pelis = new HashSet<String>();
		
		pelis.add("Shrek");
		pelis.add("Antz");
		pelis.add("Interstellar");
		pelis.add("Rango");
		pelis.add("John Wick");
		pelis.add("Planeta del tesoro");
		pelis.add("Barbie cascanueces");
		
		// Iterador a partir de nuestro hashset o cualquier coleccion
		// Tiene metodos heredados
		Iterator<String> itr = pelis.iterator();
		
		// Iterar siempre que haya algun elemento disponible
		// Se detiene cuando no se cumple
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		System.out.println(pelis);		
		
		
		
		
		////////////////////////////////////////////////////////
		// HashMap
		
		HashMap<String, Integer> products = new HashMap<String, Integer>();
		
		products.put("Marucha", 24);
		products.put("Gansito", 30);
		products.put("Chocotorro", 17);
		products.put("Picafresa", 2);
		products.put("Cheetos torciditos", 14);
		products.put("Kawasaki", 40);
		products.put("coca-cola zero", 26);
		products.put("Semillas", 15);
		
		// get para obtener la info
		System.out.println(products.get("Chocotorro"));
		
		/*
	    // ArrayList
	    1. Write a program that shuffles an arrayList of your choice
	    2. Write a program to extract elements [1-3] of an arrayList as a portion
	    3. Write a program to check if an array is empty or not (return true / false)
	    
	    // HashSet
	    1. Write a program to change an HashSet into an Array
	    2. Write a program to compare two sets
	    3. Write a program to compare two sets and return the elements that they share
	    
	    // HashMap
	    1. Write a program that adds a bunch of entries without multiple collection.add() methods
	    2. Write a program that finds out if a key-value entry is empty in its value or not
	    3. Write a program that prints all keys (not values) of a map
	    4. Write a program that prints all key-values of a map
	    
	    
	    // Any
	    1. Write a method that creates a collection of concordance of character in a string and where they happen
	 		Input -> Hellol
	 		Output -> {h=[0], e=[1], l=[2,3], o=[4]}
	*/
		
	}
}