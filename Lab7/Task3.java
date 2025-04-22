
public class Task3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.accelerate(60);
        car.brake(20);
        car.displayStatus();
    }
}

class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int value) {
        if (value > 0) {
            speed += value;
        }
    }

    public void brake(int value) {
        if (value > 0) {
            speed = Math.max(speed - value, 0);
        }
    }

    public void displayStatus() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Speed: " + speed + " km/h");
    }
}
