public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library(new Book[]{});
        Book[] books = new Book[]{};

       Book book1 = new Novel("mystery");
        book1.setName("the happy cat");
        book1.setPages(89);
        System.out.println(book1 + "Title:" + book1.getName() + " with number of pages:" + book1.getPages());

        Book book2 = new Album("good");
        book2.setName("cops in action");
        book2.setPages(31);
        System.out.println(book2 + "Title:" + book2.getName() + " with number of pages:" + book2.getPages());

        Book book3 = new Book();
        book3.setName("Royal Rumble");
        book3.setPages(44);
        System.out.println("Title: " + book3.getName() + " " + "with number of pages:" + " " + book3.getPages());

         library.addBooksInList(book1, books);
         library.addBooksInList(book2, books);
         library.addBooksInList(book3, books);
         library.addBooksInList(new Novel("psychological"), books);
         library.addBooksInList(new Book("how to take care of your garden flowers", 68), books);
         library.addBooksInList(new Album("good"), books);

    }
}
