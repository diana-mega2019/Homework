import java.util.List;

public class Hobby {
    String nameOfHobby;
    int frequencyPerWeek;
    List<Address> listOfAddress;
    Country country;

    public Hobby(String nameOfHobby, int frequency, List<Address> listOfAddress, Country country) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyPerWeek = frequency;
        this.listOfAddress = listOfAddress;
        this.country = country;
    }


    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public int getFrequencyPerWeek() {
        return frequencyPerWeek;
    }

    public List<Address> getListOfAddress() {
        return listOfAddress;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", frequencyPerWeek=" + frequencyPerWeek +
                ", listOfAddress=" + listOfAddress +
                ", country=" + country +
                '}';
    }
}
