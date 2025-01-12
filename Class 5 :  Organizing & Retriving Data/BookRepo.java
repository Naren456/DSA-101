
import java.io.IOException;
import java.util.ArrayList;

public class BookRepo{
    ArrayList<Book> bookList;
    public BookRepo(String Path) throws IOException{
        CSVDataloader dl = new CSVDataloader(Path);
        bookList = dl.loadbooklist();
    }
    public void printTitlesOfAllBooks(){
        for (int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(0));
        }
    }
    public void printAlltheAuthors(){
        for (int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(1));
        }
    }

    
}
