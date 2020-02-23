public class Employee extends Person implements Comparable {

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
