package Strategy;

public class SendMessage {
    private NotificationStrategy notificationStrategy;

    public void send(String message) {
        notificationStrategy.sendNotification(message);
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
    
}
