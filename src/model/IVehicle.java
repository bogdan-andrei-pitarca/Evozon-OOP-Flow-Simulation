package model;

public interface IVehicle {
    String getType();
    double getPrice();
    boolean isAvailable();
    void setAvailable(boolean available);
}
