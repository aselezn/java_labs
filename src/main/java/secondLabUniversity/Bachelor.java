package secondLabUniversity;

public class Bachelor extends Student {
    private EducationStage stage;
    private int year;

    public Bachelor(String name, Gender gender, String department, EducationStage stage, int year) {
        super(name, gender, department);
        setStage(stage);
        setYear(year);
    }

    public EducationStage getStage() {
        return stage;
    }

    public void setStage(EducationStage stage) {
        if(stage == null)
            throw new IllegalArgumentException("EducationStage can't be null");
        this.stage = stage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year == 0)
            throw new IllegalArgumentException("Year can't be null");
        this.year = year;
    }



    @Override
    public String getInfo() {
        return getGender().getPronoun() + " is " + getYear() + "‘th year " + getStage() + " student.";
    }


}