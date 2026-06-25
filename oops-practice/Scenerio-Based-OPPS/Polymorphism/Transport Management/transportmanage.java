class Vehicle {
    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle implements FuelCost {
    public double fuelCost(int km) {
        return km * 0.5;
    }
}

class Bus extends Vehicle implements FuelCost {
    public double fuelCost(int km) {
        return km * 0.3;
    }
}

class Bike extends Vehicle implements FuelCost {
    public double fuelCost(int km) {
        return km * 0.1; 
    }
}

class ElectricCar extends Vehicle implements FuelCost {
    public double fuelCost(int km) {
        return km * 0.2; 
    }
}

interface FuelCost {
    double fuelCost(int km);
}

class transportmanage {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[4];
        fleet[0] = new Car();
        fleet[1] = new Bus();
        fleet[2] = new Bike();
        fleet[3] = new ElectricCar();

        for (Vehicle v : fleet) {
            System.out.println("Fuel cost: " + v.fuelCost(100));
        }
    }
}