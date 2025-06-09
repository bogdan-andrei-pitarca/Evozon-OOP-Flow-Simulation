package tests;
import model.*;
import static org.junit.Assert.*;
import org.junit.Test;
import rental.User;

public class RentalTest {
    @Test
    public void testSuccessfulRental(){
        User user = new User("TestUser", 200);
        IVehicle car = new Car(100);

        assertTrue("User should rent successfully", user.rentVehicle(car));
        assertEquals("Budget should decrease", 100, user.getBudget(), 0.001);
    }

    @Test
    public void testFailedRental(){
        User user = new User("PoorUser", 5);
        IVehicle car = new Car(100);
        assertFalse("User should not rent successfully", user.rentVehicle(car));
        assertEquals("Budget should not change", 5, user.getBudget(), 0.001);
    }

    @Test
    public void testDoubleRental(){
        User user1 = new User("User1", 200);
        User user2 = new User("User2", 200);
        IVehicle car = new Car(100);
        user1.rentVehicle(car);
        assertFalse("User2 should not rent successfully", user2.rentVehicle(car));
    }
}
