import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    ArrayList<String> vehicles = new ArrayList<>();

    public void addVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            vehicles.add(regNo);
            System.out.println("Vehicle added successfully.");
        }
    }

    public void removeVehicle(String regNo) {
        if (vehicles.remove(regNo)) {
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public void searchVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println("Vehicle is currently parked.");
        } else {
            System.out.println("Vehicle is not parked.");
        }
    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Parking area is empty.");
        } else {
            System.out.println("\nParked Vehicles:");
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }
            System.out.println("Total Occupied Parking Slots: " + vehicles.size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartParkingSlotManager parking = new SmartParkingSlotManager();

        while (true) {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String addReg = sc.nextLine();
                    parking.addVehicle(addReg);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String removeReg = sc.nextLine();
                    parking.removeVehicle(removeReg);
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String searchReg = sc.nextLine();
                    parking.searchVehicle(searchReg);
                    break;

                case 4:
                    parking.displayVehicles();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}