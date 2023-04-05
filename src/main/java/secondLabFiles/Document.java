package secondLabFiles;

public class Document extends File{

    private int pages;

    public Document(String name, int size, String format, int pages) {
        super(name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages can't be 0.");
        }
        this.pages = pages;
    }

    @Override
    public String getDetails() {
        return getFormat() + ", " + getPages() + " pages";
    }
}
