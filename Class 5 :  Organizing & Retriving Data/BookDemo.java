
import java.io.FileNotFoundException;
import java.io.IOException;

public class BookDemo{
    public static void main(String[] args) throws IOException , FileNotFoundException {
        BookRepo repo = new BookRepo("/home/narendra/Desktop/DSA 101/Class 5 :  Organizing & Retriving Data/File.csv");
        repo.printTitlesOfAllBooks();
    }
}
 