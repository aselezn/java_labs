package secondLabFiles;

public abstract class AbstractMedia extends File{

    private Duration duration;

    private String description;

    public AbstractMedia(String name, int size, String format, String description, int hour, int minutes, int seconds){
        super(name,size,format);
        setDescription(description);
        this.duration = new Duration(hour, minutes, seconds);
    }

    public AbstractMedia(String name, int size, String format, String description, int minutes, int seconds){
        super(name,size,format);
        setDescription(description);
        this.duration = new Duration(minutes, seconds);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
