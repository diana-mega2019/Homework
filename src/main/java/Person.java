import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class Person {
    public static Object SortByName;
    public static Object SortByAge;
    String name;
    int age;
    List<Hobby> listOfHobbies;

    Person() {

    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, List<Hobby> listOfHobbies) {
        this.name = name;
        this.listOfHobbies = listOfHobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Hobby> getListOfHobbies() {
        return listOfHobbies;
    }

    public void setListOfHobbies(List<Hobby> listOfHobbies) {
        this.listOfHobbies = listOfHobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class SortByName implements Comparator<Person>
    {
        public int compare(Person a, Person b)
        {
            return a.name.compareTo(b.name);
        }
    }

    public static class SortByAge implements Comparator<Person>{
        public int compare(Person a, Person b) {
            return a.getAge() - b.getAge();
        }
    }


}
