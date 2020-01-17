public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library(new Books[1]);
        Books book1 = new Novels("mystery");
        book1.setName("Pisicuta fericita");
        book1.setPages(89);
        System.out.println(book1 + "Title:" + book1.getName() + " with number of pages:" + book1.getPages());

        Books book2 = new Albums("good");
        book2.setName("Politisti in actiune");
        book2.setPages(31);
        System.out.println(book2 + "Title:" + book2.getName() + " with number of pages:" + book2.getPages());

    }
}
