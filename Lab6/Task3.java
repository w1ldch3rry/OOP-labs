
public class Task3 {
    static class Animal {
        String name;
        String sound;

        void makeSound() {
            System.out.println(name + " видає звук: " + sound);
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
            new Animal(), new Animal(), new Animal()
        };
        animals[0].name = "Кіт"; animals[0].sound = "Мяу";
        animals[1].name = "Собака"; animals[1].sound = "Гав";
        animals[2].name = "Корова"; animals[2].sound = "Муу";

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
