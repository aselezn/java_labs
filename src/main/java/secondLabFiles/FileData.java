package secondLabFiles;

public class FileData {
    public static void main(String[] args) {
        File[] files = {
                new Document("j110-lab2-hiers.docx", 23212, "docx", 2),
                new Image("spb-map.png", 1703527, "image", 1024, 3072),
                new MediaFile("06-PrettyGirl.mp3", 7893454, "audio",
                        "Eric Clapton - Pretty Girl", 5, 28),
                new VideoFile("BackToTheFuture1.avi", 1470984192, "video",
                        "Back to the Future I", 1, 48, 8, 640, 352)

        };
        File.printAll(files);

    }
}
