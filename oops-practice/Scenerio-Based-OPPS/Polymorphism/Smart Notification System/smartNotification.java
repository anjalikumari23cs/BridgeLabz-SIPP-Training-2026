class Notification {
    String recipientName;
    String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending notification to " + recipientName + ": " + message);
    }
}

class EmailNotification extends Notification {
    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Email to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification to " + recipientName + ": " + message);
    }
}

public class smartNotification {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification("Alice", "Hello, Alice! This is an email notification.");
        notifications[1] = new SMSNotification("Bob", "Hello, Bob! This is an SMS notification.");
        notifications[2] = new PushNotification("Charlie", "Hello, Charlie! This is a push notification.");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
