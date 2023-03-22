package firstLabBooks;

import firstLabCountries.Country;

public class Books {

    String name; //поле название книги
    Publishers publisher; //поле данных об издательстве книги
    int year; // год издания книги
    String[] authors; //автор книги

    //констурктор для случаев, если авторов нет, с валидацией
    public Books(String name, Publishers publisher, int year){
        setName(name);
        setPublisher(publisher);
        setYear(year);
        this.authors = null;
    }

    //конструктор, где автор - массив данных, с валидацией
    public Books(String name, Publishers publisher, int year, String[] authors){
         setName(name);
         setPublisher(publisher);
         setYear(year);
         setAuthors(authors);
    }

    //конструктор, где автор - строка, с валидацией
    public Books(String name, Publishers publisher, int year, String authors){
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthors(new String[]{authors}); //массив с одной строкой
    }

    // конструктор, где можно передавать массив неизвестной длинны - этот смог бы заменить все три?
//    public Books(String name, Publishers publisher, int year, String... authors){
//        setName(name);
//        setPublisher(publisher);
//        setYear(year);
//        this.authors = authors;
//    }

    //геттер для названия книги
    public String getName() {
        return name;
    }

    //сеттер для названия книги
    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name attribute can't be null.");
        this.name = name;
    }

    //геттер для года издания книги
    public int getYear() {
        return year;
    }

    //сеттер для года издания книги
    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("Year attribute can't be greater than or equal to zero.");
        this.year = year;
    }

    //геттер для данных об издании
    public Publishers getPublisher() {
        return publisher;
    }

    //сеттер для данных об издании
    public void setPublisher(Publishers publisher) {
        if (publisher == null)
            throw new IllegalArgumentException("Publishers data can't be null.");
        this.publisher = publisher;
    }

    //геттер для авторов
    public String[] getAuthors() { return authors; }


    //сеттер для авторов
    public void setAuthors(String[] authors) {
        if (authors != null) {
            for (String author : authors) {
                if (author == null) {
                    throw new IllegalArgumentException("Authors should not contain empty references.");
                }
            }
        }
        this.authors = authors;
    }


    //метод выводящий данные по одной книге
    public void print() {
        System.out.println("Название книги: " + getName());
        if (authors != null)
            System.out.println("Авторы: " + String.join(", ", getAuthors()));
        else
            System.out.println("Авторы: unknown");
        System.out.println("Издательство: " + publisher.getPublisherName() + ", " + publisher.getCity() + ", " + year + " год ");

     }

    //метод выводящий данные о всех книгах
    public static void printAll(Books[] booksData) {
        for (Books books : booksData) {
            books.print();
            System.out.println();
        }
    }


}
