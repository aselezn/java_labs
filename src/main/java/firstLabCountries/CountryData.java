package firstLabCountries;

public class CountryData {
    public static void main(String[] args) {

        Country[] countyData = new Country[]{
                new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000)
        };
        Country rus = new Country("Russia", 0, 146_700_000,"Moscow", 12_600_000);
        //rus.print();
        //rus.setArea(0);
        rus.setCapital("yffyfyf",0);
        rus.print();
    }
}
