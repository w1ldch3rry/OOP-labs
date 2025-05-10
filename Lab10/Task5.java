interface Washable {
    void wash();
}

interface Dryable {
    void dry();
}

abstract class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    abstract void turnOn();
}

class WasherDryer extends Appliance implements Washable, Dryable {
    public WasherDryer(String brand) {
        super(brand);
    }

    public void turnOn() {
        System.out.println("Пральна машина " + brand + " увімкнена");
    }

    public void wash() {
        System.out.println("Прання запущено...");
    }

    public void dry() {
        System.out.println("Сушіння запущено...");
    }
}

public class Task5 {
    public static void main(String[] args) {
        WasherDryer wd = new WasherDryer("LG");

        wd.turnOn();
        wd.wash();
        wd.dry();

        Appliance a = wd;
        Washable w = wd;
        Dryable d = wd;

        a.turnOn();
        w.wash();
        d.dry();
    }
}
