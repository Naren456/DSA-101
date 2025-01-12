
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CSVDataloader{
    String filePath;
    public CSVDataloader(String filePath){ 
        this.filePath =filePath;

    }
     public  ArrayList<Book> loadbooklist() throws IOException{
         ArrayList<Book> bookList = new ArrayList<>();
         

       BufferedReader br = new BufferedReader(new FileReader(filePath));
         String line;
         br.readLine();
         while((line = br.readLine())!=null){
            String[] val  = line.split(",");
            String title = val[0];
            String author = val[1];
            double ratings = Double.parseDouble(val[2]);
            int reviews = Integer.parseInt(val[3]);
            int price = Integer.parseInt(val[4]);
            int year =Integer.parseInt(val[5]);
            String  genre = val[6];
            Book book = new Book( title,author,ratings,reviews,price,year,genre);
            bookList.add(book);
         
        }
        Collections.reverse(bookList);
        return bookList;

        }
    }