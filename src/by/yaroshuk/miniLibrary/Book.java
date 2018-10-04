package by.yaroshuk.miniLibrary;

public class Book {

    private String name;
    private String author;
    private long id;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(long id ,String name, String author) {
        this(name, author);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String book) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }

}
