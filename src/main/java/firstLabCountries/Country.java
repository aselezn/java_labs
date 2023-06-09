package firstLabCountries;

public class Country {

    //константа: определяет значение населения столицы по умолчанию (final - значит нельзя изменять)
    public static final int POPULATION_UNKNOWN = 0;

    private String country; //навзание страны
    private int area;// площадь старны
    private int population;//население страны
    private String capital;//название столицы страны
    private int capitalPopulation;//поппуляция столицы

    //конструктор принемающий значение всех атрибутов
    public Country(String country, int area, int population, String capitalName, int capitalPopulation) {
        setCountry(country);
        setArea(area);
        setPopulation(population);
        setCapital(capitalName, capitalPopulation);
    }

    //для городов-государств:
    // принимает только название, площадь и население страны, оставляя данные о столице пустыми
    public Country(String country, int area, int population) {
        setCountry(country);
        setArea(area);
        setPopulation(population);
        this.capital = null;
        this.capitalPopulation = 0;
    }

    //геттер расчитывающий плотность насленеия,
    public double getPopulationDensity(){
        return (double) area / population;
    }

    //геттер возвращающий значение названия страны
    public String getCountry(){
        return country;
    }

    //сеттер устанавливающий значение названия страны
    public void setCountry(String country) {
        if(country == null)
            throw new IllegalArgumentException("Country attribute can't be null.");
        this.country = country;
    }

    //геттер возвращающий значение площади страны
    public int getArea(){
        return area;
    }

    //сеттер устанавливающий значение площади страны, с валидацией
    public void setArea(int area){
        if(area <= 0)
            throw new IllegalArgumentException("Area attribute can't be greater than or equal to zero.");
        this.area = area;
    }

    //геттер возвращающий значение популяции страны
    public int getPopulation(){
        return population;
    }

    //сеттер устанавливающий значение популяции страны
    public void setPopulation(int population){
        if(population <= 0 && population != POPULATION_UNKNOWN)
            throw new IllegalArgumentException("Population attribute can't be greater than or equal to zero.");
        this.population = population;
    }

    //геттер возвращающий значение названия столицы
    public String getCapital(){
        return capital;
    }

    //геттер возвращающий значение популяции столицы
    public int getCapitalPopulation(){
        return capitalPopulation;
    }

    //сеттер устанавливающий данные столицы и сбрасывающий, если данные столицы не прошли валидацию
    public void setCapital(String capital, int capitalPopulation) {
        if (capital != null) {
            if (capitalPopulation <= 0 && capitalPopulation != POPULATION_UNKNOWN)
                throw new IllegalArgumentException("capitalPopulation attribute can't than or equal to zero.");
        this.capital = capital;
        this.capitalPopulation = capitalPopulation;
    }   else {
            this.capital = null;
            this.capitalPopulation = -1;
        }
    }

    //метод выводящий все данные об одной стране
    public void print(){
        System.out.println("country: " + getCountry() + ", area: " + getArea());
        if (population != POPULATION_UNKNOWN)
            System.out.println("population: " + getPopulation());
        else
            System.out.println("population: unknown");
        System.out.println("density: " + getPopulationDensity());

        if (capital != null)
            System.out.println("capital: " + getCapital());
        else
            System.out.println("capital: unknown");

        if (capitalPopulation != POPULATION_UNKNOWN)
            System.out.println("capital population: " + getCapitalPopulation());
        else
            System.out.println("capital population: unknown");
    }

    //метод выводящий данные о всех странах
    public static void printAll(Country[] countriesData) {

        for (Country country : countriesData) {
            country.print();
            System.out.println();
        }
    }

}
