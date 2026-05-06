package br.edu.ifsp.symploteca.domain.entities.book;

public class Book {
    private Integer id;
    private Integer edition;
    private Integer numberOfPages;
    private String name;
    private String authors;
    private String publisher;
    private String ISBN;

    private BookGenre genre;
    private BookStatus status;

    public Book() {
        status = BookStatus.AVAILABLE;
    }

    public Book(Integer edition, Integer numberOfPages, String name, String authors, String ISBN, String publisher, BookGenre genre, BookStatus status) {
        this(null, edition, numberOfPages, name, authors, publisher, ISBN, genre, status);
    }

    public Book(Integer id, Integer edition, Integer numberOfPages, String name, String authors, String publisher, String ISBN, BookGenre genre, BookStatus status) {
        this.id = id;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.genre = genre;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", edition=" + edition +
                ", numberOfPages=" + numberOfPages +
                ", name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre=" + genre +
                ", status=" + status +
                '}';
    }
}
