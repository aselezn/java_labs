package secondLabUniversity;

public enum Gender {
    MALE("He", "His"),
    FEMALE("She", "Her");

    private String pronoun;
    private String possessive;

    // Конструктор
    Gender(String pronoun, String possessive) {
        this.pronoun = pronoun;
        this.possessive = possessive;
    }

    // Геттеры для полей
    public String getPronoun() {
        return pronoun;
    }

    public String getPossessive() {
        return possessive;
    }
}