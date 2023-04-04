package secondLabUniversity;

public abstract class Person {
    private String name;
    private Gender gender;
    private String department;
    private final String verb;

    public Person(String name, Gender gender, String department, String verb) {
        setName(name);
        setGender(gender);
        setDepartment(department);

        if(verb == null)
            throw new IllegalArgumentException("verb can't be null");
        this.verb = verb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("name can't be null");
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if(gender == null)
            throw new IllegalArgumentException("Gender can't be null");
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department == null)
            throw new IllegalArgumentException("Department can't be null");
        this.department = department;
    }

    public abstract String getInfo();

    public void print() {
        // common info
        System.out.println("This is " + name + ". "
                + gender.getPronoun() + " " + verb + " at " + department + ".");
        // partial info
        System.out.println(getInfo());

        // common info 2

        // partial info 2

        // common info 3
    }

    public static void printAll(Person[] persons) {
        for (Person person : persons) {
            person.print();
            System.out.println();
        }
    }

}
