package rental;
import model.IVehicle;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private double budget;
    private final List<IVehicle> rentedVehicles;

    public User(String name, double budget){
        this.name = name;
        this.budget = budget;
        this.rentedVehicles = new ArrayList<>();
    }

    public boolean rentVehicle(IVehicle vehicle){
        if (!vehicle.isAvailable()){
            System.out.println(name + " cannot rent " + vehicle.getType() + ", since it's already booked");
            return false;
        }
        if (this.budget < vehicle.getPrice()){
            System.out.println(name + " cannot rent " + vehicle.getType() + ", since their budget isn't high enough");
            return false;
        }

        vehicle.setAvailable(false);
        this.rentedVehicles.add(vehicle);
        this.budget -= vehicle.getPrice();
        System.out.println(name + " successfully rented a " + vehicle.getType() + " for $" + vehicle.getPrice());
        return true;
    }

    public boolean returnVehicle(IVehicle vehicle){
        if (!rentedVehicles.contains(vehicle)){
            System.out.println(name + " cannot return " + vehicle.getType() + ", since they never rented it");
            return false;
        }

        vehicle.setAvailable(true);
        this.rentedVehicles.remove(vehicle);
        this.budget += vehicle.getPrice();
        System.out.println(name + " successfully returned the " + vehicle.getType());
        return true;
    }

    public double getBudget() { return budget; }
}
