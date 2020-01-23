public class Album extends Book {
    private String papaerquality;

    public Album(String papaerquality) {
        super.name = name;
        super.pages = pages;
        this.papaerquality = papaerquality;
    }
    public String getPapaerquality() {
        return papaerquality;
    }

    public void setPapaerquality(String papaerquality) {
        this.papaerquality = papaerquality;
    }

    @Override
    public String toString() {
        return "Album{" +
                "papaerquality='" + papaerquality + '\'' +
                '}';
    }
}
