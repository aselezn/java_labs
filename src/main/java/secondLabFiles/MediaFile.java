package secondLabFiles;

public class MediaFile extends AbstractMedia {

    public MediaFile(String name, int size, String format, String description, int minutes, int seconds) {
        super(name, size, format, description, minutes, seconds);
    }

    @Override
    public String getDetails() {
        return getFormat() + ", " + getDescription() + ", " + getDuration().getDurationInfo();
    }
}
