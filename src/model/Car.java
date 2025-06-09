package model;

public class Car implements IVehicle {
    private boolean available;
    private final double price;

    public Car(double price){
        this.price = price;
        this.available = true;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
