public class Albums extends Books {
    private String papaerquality;

    public Albums(String papaerquality) {
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
        return "Albums{" +
                "papaerquality='" + papaerquality + '\'' +
                '}';
    }
}
