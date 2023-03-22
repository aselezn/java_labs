package firstLabBooks;

public class Publishers {

    String publisherName; //название издательства
    String city; //город издательства

    //конструктор для издательств
    public Publishers(String publisherName,String city){
        setPublisherName(publisherName);
        setCity(city);
    }

    //геттер для названия издательста
    public String getPublisherName() {
        return publisherName;
    }

    //сеттер для названия издательста
    public void setPublisherName(String publisherName){
        if (publisherName == null)
            throw new IllegalArgumentException("Publisher name can't be null.");
        this.publisherName = publisherName;
    }

    //геттер для города издательста
    public String getCity() {
        return city;
    }

    //сеттер для города издательста
    public void setCity(String city){
        if (city == null)
            throw new IllegalArgumentException("City name can't be null.");
        this.city = city;
    }
}
