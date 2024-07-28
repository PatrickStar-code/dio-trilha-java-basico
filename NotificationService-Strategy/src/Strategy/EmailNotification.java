package Strategy;
public class EmailNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}

