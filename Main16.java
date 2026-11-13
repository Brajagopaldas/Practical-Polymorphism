class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}

class Email extends Notification {
    void send() {
        System.out.println("Sending Email notification");
    }
}

class SMS extends Notification {
    void send() {
        System.out.println("Sending SMS notification");
    }
}

class PushNotification extends Notification {
    void send() {
        System.out.println("Sending Push Notification");
    }
}

class Main16 {
    public static void main(String[] args) {
        Notification n;

        n = new Notification();
        n.send();

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new PushNotification();
        n.send();
    }
}
