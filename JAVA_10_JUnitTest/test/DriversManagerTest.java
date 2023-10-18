package org.generation.test_Unit.test;

import org.generation.test_Unit.centralDeCamiones.Driver;
import org.generation.test_Unit.centralDeCamiones.DriversManager;
import org.generation.test_Unit.centralDeCamiones.Passenger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DriversManagerTest {
    private final DriversManager driversManager = new DriversManager();

    @Before
    public void setup(){
        driversManager.addPassenger(new Passenger("Carlos", "44234", 100));
        driversManager.addPassenger(new Passenger("Elise", "533434", 100));
        driversManager.addPassenger(new Passenger("Ian", "5343433", 100));
        driversManager.addPassenger(new Passenger("Debbie", "44555521", 100));
        driversManager.addPassenger(new Passenger("Cleon", "559988", 100));
        driversManager.addPassenger(new Passenger("Santiago", "1203123", 100));

        driversManager.addDriver(new Driver("Emilio", "1234990", 10f));
        driversManager.addDriver(new Driver("Pedro", "12312440", 12f));
        driversManager.addDriver(new Driver("Constanza", "9824990", 11f));
    }

    @Test
    public void testAddPassenger(){
        String passengerId = "44234";
        Passenger passenger = driversManager.getPassenger(passengerId);
        Assert.assertNotNull(passenger);  // Verifica que el pasajero no sea nulo
        Assert.assertEquals("Carlos", passenger.getName());  // Verifica el nombre del pasajero
        Assert.assertEquals(100, passenger.getBalance(), 0.01);  // Verifica el saldo del pasajero
    }
    
    @Test
    public void testAddDriver(){
        String driverId = "1234990";
        Driver driver = driversManager.getDriver(driverId);
        Assert.assertNotNull(driver);  // Verifica que el conductor no sea nulo
        Assert.assertEquals("Emilio", driver.getName());  // Verifica el nombre del conductor
        Assert.assertEquals(10f, driver.getFee(), 0.01);  // Verifica la tarifa del conductor
    }
}
