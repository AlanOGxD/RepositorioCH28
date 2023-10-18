package org.generation.test_Unit.person;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Person_Test {
	Person person1 = new Person("Daniel", "Maldonado", "daniel@gmail.com", "generation", 36);
	Person person2 = new Person("Zabdiel", "Diaz", "zabdiel.diaz@correo.com", "X09oGH123", 26);
	Person person3 = new Person("Enrique", "Cano", "enrique.cano@gmail.com", "123456", 41);
	
	//Agregamos la anotación @Test e importamos.
	//Podemos agregar la anotación @DisplayName para personalizar el nombre de mi método test
    @Test
    public void testPerson1(){        
        Assert.assertEquals("Daniel", person1.getFirstName());
        Assert.assertEquals("Maldonado", person1.getLastName());
        Assert.assertEquals("daniel@gmail.com", person1.getEmail());
        Assert.assertEquals("generation", person1.getPassword());
        Assert.assertEquals(36, person1.getAge());
    }
    
    @Test
    public void testPerson2(){
    	Assert.assertEquals("Zabdiel", person2.getFirstName());
    	Assert.assertEquals("Diaz", person2.getLastName());
    	Assert.assertEquals("zabdiel.diaz@correo.com", person2.getEmail());
    	Assert.assertEquals("X09oGH123", person2.getPassword());
    	Assert.assertEquals(26, person2.getAge());
    }

    @Test
    public void testPerson3() {
    	Assert.assertEquals("Enrique", person3.getFirstName());
    	Assert.assertEquals("Cano", person3.getLastName());
    	Assert.assertEquals("enrique.cano@gmail.com", person3.getEmail());
    	Assert.assertEquals("123456", person3.getPassword());
    	Assert.assertEquals(41, person3.getAge());
    }
    
    @Test
    @DisplayName("Validar formato de correo electrónico con sintaxis correo@gmail.com")
    public void testEmailFormat() {
    	//Assert.assertTrue. Afirma que una condición es verdadera. Si no es así, arroja un AssertionError con el mensaje dado.
    	//.matches. Indica si el String coincide o no con la expresión regular dada. Una invocación de este método de la forma str.matches(regex) produce exactamente el mismo resultado que la expresión
    	
    	Assert.assertTrue(person1.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(person2.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(person3.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	
    	/*	^ representa el inicio del texto.
    	 * 	[A-Za-z0-9._%+-]+ indica que debe haber uno o más caracteres alfanuméricos, puntos, guiones bajos, porcentajes, signos más y signos menos.
    	 * 	@ representa el símbolo de arroba.
    	 * 	gmail\\.com se utiliza para verificar que la cadena "gmail.com" esté presente después del símbolo de arroba. 
    	 * 	El \\ se utiliza para escapar el carácter . y asegurarse de que se interprete literalmente como un punto y no como un carácter especial que coincida con cualquier carácter.
    	 * 	$ representa el final del texto.*/
    } 
}
