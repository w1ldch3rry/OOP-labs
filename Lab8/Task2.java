
public class Task2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.showSpeed();
    }
}

class Vehicle {
    protected int speed = 0;

    public void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    public void accelerate() {
        speed += 10;
    }
}
