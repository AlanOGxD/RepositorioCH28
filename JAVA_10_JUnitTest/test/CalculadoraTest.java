package org.generation.test_Unit.test;

import static org.junit.Assert.assertEquals;

import org.generation.test_Unit.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//Instanciar un objeto de tipo Calculadora que nos servirá para realizar las pruebas unitarias
	//Nos va a solicitar importar la clase desde el otro paquete
	private Calculadora calculadoraTest;
	
	@BeforeEach
	public void setUp() {
		calculadoraTest = new Calculadora();
	}
	
    @Test
    @DisplayName("Test de suma de dos números")
    public void sumarTest(){
        assertEquals( 8, calculadoraTest.sumarNumeros( 5, 3 ) );
    }


    @Test
    public void restarTest(){
        assertEquals( 5, calculadoraTest.restarNumeros( 10, 5 ) );
    }


    @Test
    public void multiplicarTest(){
        assertEquals( 15, calculadoraTest.multiplicarNumeros( 5, 3 ) );
    }


    @Test
    public void dividirTest(){
        assertEquals( 5, calculadoraTest.dividirNumeros( 5, 0 ) );
    }
}
