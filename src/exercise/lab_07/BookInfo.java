package exercise.lab_07;
/*
  Create a book class with: ISBN, authorName, Year
  Create a simple menu to allow user to input books
  Find book by using ISBN and print the found book by implementing toString method
 * */
public class BookInfo {
    private String bookTitle;
    private String bookAuthor;
    private String bookPrice;
    private String bookYear;

    public BookInfo() {
    }

    public BookInfo(String bookTitle, String bookAuthor, String bookPrice, String bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookYear='" + bookYear + '\'' +
                '}';
    }
}
