package Chapter9;

public class PrintBook extends Book {
    private final String PUBLISHER;
    private final String ISBN;

    public PrintBook(String publisher, String isbn, String title, String yearOfPublication, String author) {
        super(title, yearOfPublication, author);
        this.PUBLISHER = publisher;
        this.ISBN = isbn;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPUBLISHER() {
        return PUBLISHER;
    }

    @Override
    public String toString() {

        return String.format("%s%s%n %s%s%n %s%s%n %s%s%n %s%s%n ", "title of book: ", getTitle(),
                "name of author: ", getAuthor(), "year of publication: ", getYearOfPublication(),
                "published by: ", getPUBLISHER(), "ISBN: ", getISBN());
    }
}
