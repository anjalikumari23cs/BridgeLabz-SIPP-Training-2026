class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(getModel() + " is charging.");
    }
}

interface Refuelable {
    void refuel();
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is refueling.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180);

        System.out.println("Electric Vehicle: " + ev.getModel() + ", Max Speed: " + ev.getMaxSpeed() + " km/h");
        ev.charge();

        System.out.println("Petrol Vehicle: " + pv.getModel() + ", Max Speed: " + pv.getMaxSpeed() + " km/h");
        pv.refuel();
    }
}
