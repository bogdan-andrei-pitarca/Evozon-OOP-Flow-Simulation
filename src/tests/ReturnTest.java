package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import model.*;
import rental.User;

public class ReturnTest {
    @Test
    public void testReturnVehicle(){
        User user = new User("TestUser", 200);
        IVehicle car = new Car(100);

        user.rentVehicle(car);
        assertTrue("Return should succeed", user.returnVehicle(car));
        assertEquals("Budget should restore", 200, user.getBudget(), 0.001);
    }

    @Test
    public void testInvalidReturn(){
        User user = new User("TestUser", 200);
        IVehicle car = new Car(100);

        assertFalse("Should reject unrented vehicle", user.returnVehicle(car));
    }
}
