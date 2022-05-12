package Chapter9;

public class AudioBook extends Book {
    private final double SIZE;
    private final String PLAY_LENGTH;
    private final String ARTIST_NAME;


    public AudioBook(String title, String yearOfPublication, String author, double size, String play_length, String artist_name) {
        super(title, yearOfPublication, author);
        SIZE = size;
        PLAY_LENGTH = play_length;
        ARTIST_NAME = artist_name;
    }

    public double getSIZE() {
        return SIZE;
    }

    public String getPLAY_LENGTH() {
        return PLAY_LENGTH;
    }

    public String getARTIST_NAME() {
        return ARTIST_NAME;
    }

    @Override
    public String toString() {

        return String.format("%s%s%n: %s%s%n: %s%s%n: %s%s%n: %s%s%n: %s%s%n: %s%s%n: ", "title of book: ", getTitle(),
                "name of author: ", getAuthor(), "year of publication: ", getYearOfPublication(),
                "size: ", getSIZE(), "play length: ", getPLAY_LENGTH(), "artist's name: ", getSIZE());
    }
}
