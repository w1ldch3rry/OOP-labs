
public class Task5 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime(23, 59, 58);
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();
    }
}

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) this.seconds = seconds;
    }

    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    public void displayTime() {
        System.out.printf("Current time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
