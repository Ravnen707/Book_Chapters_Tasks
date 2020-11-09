package Kapitel10;

public class Time {
    public long hour;
    public long minute;
    public long second;


    public void Time() {
        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;
    }

    public void Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    class trying {
        public void main(String[] args) {
            Time time = new Time();
            System.out.println(time.hour + ":" + time.minute + ":" + time.second);
        }
    }
}
