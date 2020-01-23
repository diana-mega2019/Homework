import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public static void addBooksInList(Book booksToAdd, Book[] arrayToAddBooks){
        Book[] newArray = Arrays.copyOf(arrayToAddBooks, arrayToAddBooks.length +1);
    }
   // public static void deleteBooksInList(Book[] books, Book bookToDelete){
       
    }

   // public static void listBooksFromList(Book[] books) {
    //    for (int i = 0; i <= books.length; i++) {
      //      System.out.println(books[i]);
        //}
    //}



