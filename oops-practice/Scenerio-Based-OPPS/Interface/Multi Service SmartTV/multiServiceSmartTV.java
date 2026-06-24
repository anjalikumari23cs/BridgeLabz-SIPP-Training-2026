interface StreamingService {
    void streamContent();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription: Basic Plan");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription: Basic Plan");
    }
}

class SmartTV implements StreamingService, GamingService {
    private String[] movies = { "Inception", "The Matrix", "Interstellar" };
    private String[] games = { "FIFA 21", "Call of Duty", "Minecraft" };

    @Override
    public void streamContent() {
        System.out.println("Streaming content...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing game...");
    }

    @Override
    public void showSubscriptionDetails() {
        // Resolving default method conflict by providing a custom implementation
        System.out.println("Subscription Details: Premium Plan");
    }

    public void displayAvailableContent() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
        System.out.println("Available Games:");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }
}

public class multiServiceSmartTV {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        smartTV.showSubscriptionDetails();
        smartTV.displayAvailableContent();
    }
}
