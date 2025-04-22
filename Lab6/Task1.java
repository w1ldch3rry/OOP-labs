
public class Task1 {
    static class Person {
        String name;
        int age;

        void introduce() {
            System.out.println("Привіт, мене звати " + name + ", мені " + age + " років.");
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Оля";
        p.age = 22;
        p.introduce();
    }
}
