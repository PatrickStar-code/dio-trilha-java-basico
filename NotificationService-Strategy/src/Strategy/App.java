package Strategy;

public class App {

    public static void main(String[] args) throws Exception {

        SMSNotification sms = new SMSNotification();
        EmailNotification email = new EmailNotification();
        SendMessage message = new SendMessage();

        message.setNotificationStrategy(sms);
        message.send("Hello World");
        message.setNotificationStrategy(email);
        message.send("Hello World");
    }
}
