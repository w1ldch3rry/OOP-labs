
public class Task2b {
    static class Car {
        String brand;
        String model;
        int speed;

        void accelerate(int increment) {
            speed += increment;
        }

        void printInfo() {
            System.out.println("Марка: " + brand + ", Модель: " + model + ", Швидкість: " + speed);
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.speed = 60;
        car.accelerate(20);
        car.printInfo();
    }
}
