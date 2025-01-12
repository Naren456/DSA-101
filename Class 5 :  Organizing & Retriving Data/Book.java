public class Book{
     String title;
     String author;
     double userRating;
    int reviews;
     int price;
     int year;
     String genre;
    public Book(String title, String author, double userRating, int reviews, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
   
    //setData//
    void setTitle(String title) { this.title = title;}
    void setAuthor(String Author) {this.author = Author;}
    void setUserRating(double Rating) {this.userRating =Rating;}
    void setReview(int Reviews) {this.reviews= Reviews;}
    void setPrice(int Price) {this.price = Price;}
    void setYear(int Year) {this.year = Year;}
    void setGenre(String Genre) {this.genre = Genre;}

    //Get Data //
    String getName(){return title;}
    String getAuthor(){return author;}
    double getRating(){return userRating;}
    int getReview(){return reviews;}
    int getPrice(){return price;}
    int getYear(){return year;}
    String getGenre(){return genre;}
}

