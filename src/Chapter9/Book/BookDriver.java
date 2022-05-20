package Chapter9.Book;

public class BookDriver {
    public static void main(String[] args) {
        Book book = new Book("the lost world","2020", "akinsola tolani");
        PrintBook printBook = new PrintBook("olasco", "4323hg", "the lost city", "2020","akinsola tolani");
        AudioBook audioBook = new AudioBook("the lost city", "2022", "akinsola tolani", 2.3, "5mins", "davido");


        System.out.println(printBook);
        System.out.println(book);
        System.out.println(audioBook);

        
        System.out.println(audioBook.getPLAY_LENGTH());

    }
}
