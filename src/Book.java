import java.util.Objects;

public class Book {
    private final String name;
    private Author author;
    private int publisherDate;

    public Book(String name, Author author, int publisherDate) {
        this.name = name;
        this.author = author;
        this.publisherDate = publisherDate;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublisherDate(){
        return this.publisherDate;
    }
    public void setPublisherDate(int publisherDate){
        this.publisherDate = publisherDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", publisherDate=" + publisherDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherDate == book.publisherDate && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisherDate);
    }
}
