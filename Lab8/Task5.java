
public class Task5 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.turnOn();
        p.makeCall();

        Tablet t = new Tablet();
        t.turnOn();
        t.watchVideo();

        SmartPhone s = new SmartPhone();
        s.turnOn();
        s.makeCall();
        s.browseInternet();
    }
}

class Device {
    public void turnOn() {
        System.out.println("Device is turning on...");
    }
}

class Phone extends Device {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }
}

class Tablet extends Device {
    public void watchVideo() {
        System.out.println("Watching a video...");
    }
}

class SmartPhone extends Phone {
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("SmartPhone is ready.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}
