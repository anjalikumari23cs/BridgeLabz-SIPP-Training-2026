class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 0.15;
    private String stationId;
    private int unitsConsumed;

    public ChargingStation(String stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println(
                "Station ID: " + stationId + ", Units Consumed: " + unitsConsumed + ", Bill: $" + calculateBill());
    }
}

public class ElectricVehicleChargingNetwork {
    public static void main(String[] args) {
        ChargingStation station1 = new ChargingStation("CS101", 50);
        ChargingStation station2 = new ChargingStation("CS102", 75);
        ChargingStation station3 = new ChargingStation("CS103", 100);

        station1.displayStationDetails();
        station2.displayStationDetails();
        station3.displayStationDetails();

        System.out.println("Total Charging Stations: " + ChargingStation.totalStations);
    }
}
