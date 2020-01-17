public class Novels extends Books{
    private String type;

    public Novels(String type){
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
        return "Novels{" +
                "type='" + type + '\'' +
                '}';
    }
}
