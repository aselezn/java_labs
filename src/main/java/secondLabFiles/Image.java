package secondLabFiles;

public class Image extends File{

    private Resolution resolution;

    public Image(String name, int size, String format, int width, int height){
        super(name, size, format);
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
        return "image, " + getResolution().getResolutionInfo();
    }
}
