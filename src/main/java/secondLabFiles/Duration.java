package secondLabFiles;

public class Duration {
    private int hour;
    private int minutes;
    private int seconds;

    public Duration(int minutes, int seconds) {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Duration(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59.");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be non-negative.");
        }
        this.hour = hour;
    }

    public String getDurationInfo() {
        if (getHour() > 0) {
            return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
        } else {
            return String.format("%02d:%02d", getMinutes(), getSeconds());
        }
    }
}
