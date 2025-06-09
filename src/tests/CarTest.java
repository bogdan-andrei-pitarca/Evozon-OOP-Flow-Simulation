package tests;
import model.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {
    @Test
    public void testCarPricing(){
        Car car = new Car(100);
        assertEquals("Car price should match", 100, car.getPrice(), 0.001);
    }

    @Test
    public void testInitialAvailability() {
        Car car = new Car(100);
        assertTrue("New car should be available", car.isAvailable());
    }

    @Test
    public void testSetAvailability(){
        Car car = new Car(100);
        car.setAvailable(false);
        assertFalse("New car should not be available", car.isAvailable());
    }
}
