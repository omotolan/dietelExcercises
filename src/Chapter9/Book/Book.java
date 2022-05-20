package Chapter9.Book;

public class Book {
    private final String TITLE;
    private final String YEAR_OF_PUBLICATION;
    private final String AUTHOR;

    public Book(String title, String yearOfPublication, String author) {
        this.TITLE = title;
        this.YEAR_OF_PUBLICATION = yearOfPublication;
        this.AUTHOR = author;
    }

    public String getTitle() {
        return TITLE;
    }

    public String getYearOfPublication() {
        return YEAR_OF_PUBLICATION;
    }

    public String getAuthor() {
        return AUTHOR;
    }

    @Override
    public String toString() {

        return String.format("%s%s%n %s%s%n %s%s%n ", "title of book: ", getTitle(), "name of author: ", getAuthor(),
                "year of publication: ", getYearOfPublication());
    }
}
