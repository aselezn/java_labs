package secondLabFiles;

public class VideoFile extends AbstractMedia{

    private Resolution resolution;

    public VideoFile(String name, int size, String format, String description,
                     int hour, int minutes, int seconds,int width, int height) {
        super(name, size, format, description, hour, minutes, seconds);
        this.resolution = new Resolution(width, height);
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String getDetails() {
        return getFormat() + ", " + getDescription() + ", " + getDuration().getDurationInfo() + ", " + getResolution().getResolutionInfo();
    }
}
