interface Trackable {
    void logActivity(String activity, int duration);

    default void resetData() {
        System.out.println("Data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    @Override
    public void logActivity(String activity, int duration) {
        System.out.println("Activity logged: " + activity + " for " + duration + " minutes.");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating fitness report.");
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert sent: " + message);
    }
}

public class fitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();
        device.logActivity("Running", 30);
        device.generateReport();
        device.sendAlert("Time to hydrate!");
        device.resetData();
    }
}
