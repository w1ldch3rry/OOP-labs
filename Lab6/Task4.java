
public class Task4 {
    static class Counter {
        int count = 0;

        void increment() {
            count++;
        }

        int getCount() {
            return count;
        }
    }

    static class StaticCounter {
        static int count = 0;

        static void increment() {
            count++;
        }

        static int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment(); c1.increment();
        c2.increment();
        System.out.println("Counter 1: " + c1.getCount()); // 2
        System.out.println("Counter 2: " + c2.getCount()); // 1

        StaticCounter.increment(); StaticCounter.increment();
        System.out.println("StaticCounter: " + StaticCounter.getCount()); // 2
    }
}
