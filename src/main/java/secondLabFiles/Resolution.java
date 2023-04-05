package secondLabFiles;

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        setHeight(height);
        setWidth(width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width can't be 0.");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height can't be 0.");
        }
        this.height = height;
    }

    public String  getResolutionInfo() {
        return getWidth() + "x" + getHeight();
    }
}
