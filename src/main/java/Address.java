public class Address {
    String street;
    int numberOfStreet;
    Country country;

    public Address(String street, int numberOfStreet, Country country) {
        this.street = street;
        this.numberOfStreet = numberOfStreet;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfStreet() {
        return numberOfStreet;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numberOfStreet=" + numberOfStreet +
                '}';
    }
}
