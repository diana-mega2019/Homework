public class Library {
    private Books[] books;

    public Library(Books[] books) {
        this.books = books;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    public void addBooks(Books[] books) {
        Books[] books1 = new Books[1];
        Books books1copy[] = new Books[books1.length];
        System.arraycopy(books1, 0, books1copy, 0, books1.length + 1);
        books1copy[books1copy.length - 1] = new Books();
    }

}

