public class Books{
    protected String name;
    protected int pages;


   public Books(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public Books() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
