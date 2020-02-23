public class Unemployed extends Person implements Comparable  {
    public Unemployed(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
