package secondLabUniversity;

public class UniversityData {
    public static void main(String[] args) {

        Person[] persons = {
                new Teacher("Ronald Turner", Gender.MALE, "Computer science",
                        Degree.PHD, "Programming paradigms"),
                new Teacher("Ruth Hollings", Gender.MALE, "Jurisprudence",
                        Degree.DOCTOR, "Domestic arbitration"),
                new Bachelor("Leo Wilkinson", Gender.MALE, "Computer science",
                        EducationStage.BACHELOR, 1),
                new Bachelor("Anna Cunningham", Gender.FEMALE, "World economy",
                        EducationStage.BACHELOR, 1),
                new Bachelor("Jill Lundqvist", Gender.FEMALE, "Jurisprudence",
                        EducationStage.MASTER, 1),
                new Master("Ronald Correa", Gender.MALE, "Computer science",
                        "Design of a functional programming language.")
        };

        Person.printAll(persons);

    }
}
