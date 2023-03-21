package firstLabCountries;

public class CountryData {
    public static void main(String[] args) {

        Country[] countriesData = new Country[]{
                new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                new Country("France", 643_800_000, 67_800_000, "Paris", 2_100_000),
                new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
                new Country("Singapore", 725, 5_700_000)
        };

        //Для тестирвоания методов:
        Country rus = new Country("Russia", 10, 0,"Moscow", 0);
        //rus.print();
        //rus.setArea(-1);
        rus.setPopulation(0);
        //rus.setCapital("СПб", 1_000_000);
        //rus.print();
        //Country.printAll(countriesData);
    }
}

