public class Student extends Person implements Comparable {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
