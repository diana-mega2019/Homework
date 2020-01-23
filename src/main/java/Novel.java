public class Novel extends Book {
    private String type;

    public Novel(String type){
        super.name = name;
        super.pages = pages;
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "type='" + type + '\'' +
                '}';
    }
}
