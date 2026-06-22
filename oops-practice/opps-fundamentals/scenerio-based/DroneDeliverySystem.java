class Drone {
    int droneId;
    static String companyName = "SkyDeliver";
    double batteryPercentage;

    Drone(int droneId, double batteryPercentage, String companyName) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
        this.companyName = companyName;
    }

    void startDelivery() {
        if (companyName.equals("SkyDeliver")) {
            System.out.println("Drone " + droneId + " from " + companyName + " is starting delivery.");
        } else {
            System.out.println("Drone " + droneId + " is starting delivery.");
        }
    }

    void displayStatus() {
        System.out.println(
                "Drone ID: " + droneId + ", Company: " + companyName + ", Battery: " + batteryPercentage + "%");
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone drone1 = new Drone(101, 85.5, "SkyDeliver");
        Drone drone2 = new Drone(102, 60.0, "SkyDeliver");
        Drone drone3 = new Drone(103, 45.0, "SkyDeliver");

        drone1.startDelivery();
        drone2.startDelivery();
        drone3.startDelivery();

        drone1.displayStatus();
        drone2.displayStatus();
        drone3.displayStatus();
    }
}
