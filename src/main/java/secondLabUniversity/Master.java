package secondLabUniversity;

public class Master extends Student {

    private String  dissertation;

    public Master(String name, Gender gender, String department, String  dissertation) {
        super(name, gender, department);
        setDissertation(dissertation);
    }

    public String getDissertation() {
        return dissertation;
    }

    public void setDissertation(String dissertation) {
        if(dissertation == null)
            throw new IllegalArgumentException("Dissertation can't be null");
        this.dissertation = dissertation;
    }

    @Override
    public String getInfo() {
        return getGender().getPossessive() + " thesis title is " + getDissertation() + ".";
    }
}
