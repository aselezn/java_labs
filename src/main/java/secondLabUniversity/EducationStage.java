package secondLabUniversity;

public enum EducationStage {
    BACHELOR("Bachelor"),
    MASTER("Master");

    private String stage;

    EducationStage(String stage) {
        this.stage = stage;
    }

    public String getStage() {
        return stage;
    }

}
