package secondLabUniversity;

public enum Degree {
    CANDIDATE("Candidate of Sciences"),
    DOCTOR("Doctor of Sciences"),
    PHD("PhD");

    private String degree;

    Degree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
}