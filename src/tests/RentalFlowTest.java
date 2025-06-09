package tests;
import model.*;
import rental.User;
import static org.junit.Assert.*;
import org.junit.Test;

public class RentalFlowTest {
    @Test
    public void testFullRentalFlow(){
        IVehicle car = new Car(100);
        IVehicle scooter = new Scooter(5);
        User userA = new User("TestUserA", 100);
        User userB = new User("TestUserB", 200);

        // UserA rents car

        assertTrue(userA.rentVehicle(car));

        // UserB fails to rent

        assertFalse(userB.rentVehicle(car));

        // UserA returns

        assertTrue(userA.returnVehicle(car));

        // UserB now succeeds

        assertTrue(userB.rentVehicle(car));

        // UserB rents scooter

        assertTrue(userB.rentVehicle(scooter));

        // UserB returns scooter

        assertTrue(userB.returnVehicle(scooter));

        // UserA rents scooter

        assertTrue(userA.rentVehicle(scooter));

    }
}
