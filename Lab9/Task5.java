
public class Task5 {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        for (Notification n : notifications) {
            n.send("Hello, user!");
        }
    }
}

class Notification {
    public void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

class EmailNotification extends Notification {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSNotification extends Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification extends Notification {
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
