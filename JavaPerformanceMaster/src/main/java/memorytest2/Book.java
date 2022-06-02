package memorytest2;

public class Book {
    private int id;
    private String title;
    private String author;
    private Price price;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = new Price(price);
    }

    public Book(Book other) {
        this.id = other.getId();
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.price = new Price(other.getPrice().getValue());
    }

    public String toString() {
        return title + " by " + author;
    }

    public Price getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = new Price(price);
    }

}
