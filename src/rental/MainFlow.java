package rental;
import model.*;
import rental.User;

public class MainFlow {
    public static void main(String[] args) {
        IVehicle car = new Car(100);
        IVehicle scooter = new Scooter(5);

        User user1 = new User("Bogdan", 100);
        User user2 = new User("Andrei", 200);

        System.out.println("\n>>>> STARTING SIMULATION <<<<");

        user1.rentVehicle(car); // user 1 rents car (SUCCESS)
        user2.rentVehicle(car); // user 2 rents car (FAIL - car already booked by someone else)
        user1.returnVehicle(car); // user 1 returns their car
        user2.rentVehicle(car); // user 2's request is now accepted
        user2.rentVehicle(scooter); // user 2 rents a scooter
        user2.returnVehicle(scooter); // user 2 returns their scooter
        user1.rentVehicle(scooter); // user 1 rents scooter

        System.out.println("\n>>>> FINAL BUDGETS: <<<<");
        System.out.println("User 1: $" + user1.getBudget());
        System.out.println("User 2: $" + user2.getBudget());
    }
}
