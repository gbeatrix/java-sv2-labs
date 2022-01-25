package lambdastreams.bookstore;

public class Book {
    private String title;
    private int yearOfPublish;
    private int price;
    private int count;

    public Book(String title, int yearOfPublish, int price, int count) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.price = price;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
