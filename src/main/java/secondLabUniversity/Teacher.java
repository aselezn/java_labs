package secondLabUniversity;

public class Teacher extends Person {
    private Degree degree;
    private String specialty;

    public Teacher(String name, Gender gender, String department, Degree degree, String specialty) {
        super(name, gender, department, "teaches");
        setDegree(degree);
        setSpecialty(specialty);
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        if(degree == null)
            throw new IllegalArgumentException("Degree can't be null");
        this.degree = degree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if(specialty == null)
            throw new IllegalArgumentException("Specialty can't be null");
        this.specialty = specialty;
    }

    @Override
    public String getInfo() {
        return getGender().getPronoun() + " has " + getDegree() + " degree in " + getSpecialty() + ".";
    }

}
