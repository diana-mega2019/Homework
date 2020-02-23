import java.util.*;

public class ContainersMain {

    public static void main(String[] args) {
        Person.SortByName = new Person.SortByName();

        Set<Person> persons = new TreeSet<Person>((Comparator<? super Person>) Person.SortByName);

        Person p1 = new Unemployed("Michael", 58);
        Person p2 = new Student("Abdul", 21);
        Person p3 = new Employee("Karen", 32);
        Person p4 = new Student("Carol", 24);
        Person p5 = new Employee("Sara", 28);
        Person p6 = new Student("Sara", 28);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        for (Person element : persons) {
            System.out.println(element);
        }
        System.out.println();

        Person.SortByAge = new Person.SortByAge();
        TreeSet personTreeSet = new TreeSet<Person>((Comparator<? super Person>) Person.SortByAge);
        personTreeSet.addAll(persons);


        for (Object element : personTreeSet) {
            System.out.println(element);
        }


        //2. information about persons

        Country italy = new Country("Italy");
        Country canada = new Country("Canada");

        Address addressForSwimming = new Address("str. SanGiovanni", 152, italy);
        Address addressForSwimming1 = new Address("str. AquaRoad", 44, italy);
        Address addressForSwimming2 = new Address("str. A.Raw", 10, italy);

        Address addressForDancing = new Address("str. ABrien", 55, canada);
        Address addressForDancing1 = new Address("str. Cruise", 12, canada);
        Address addressForDancing2 = new Address("str. FlowerAle", 27, canada);

        Address addressForSinging = new Address("G.Rio", 33, canada);
        Address addressForSinging1 = new Address("John.T", 58, canada);
        Address addressForSinging2 = new Address("Brown.K", 30, canada);

        Address addressForDriving = new Address("M.Vio", 4, italy);
        Address addressForDriving1 = new Address("Parc.R", 77, italy);
        Address addressForDriving2 = new Address("Greg.J", 91, italy);

        List<Address> addressListForSwimming = new ArrayList<>();
        addressListForSwimming.add(addressForSwimming);
        addressListForSwimming.add(addressForSwimming1);
        addressListForSwimming.add(addressForSwimming2);


        List<Address> addressListForDancing = new ArrayList<>();
        addressListForDancing.add(addressForDancing);
        addressListForDancing.add(addressForDancing1);
        addressListForDancing.add(addressForDancing2);

        List<Address> addressListForSinging = new ArrayList<>();
        addressListForSinging.add(addressForSinging);
        addressListForSinging.add(addressForSinging1);
        addressListForSinging.add(addressForSinging2);

        List<Address> addressListForDriving = new ArrayList<>();
        addressListForDriving.add(addressForDriving);
        addressListForDriving.add(addressForDriving1);
        addressListForDriving.add(addressForDriving2);

        Person p7 = new Student("Alex", 20);

        Hobby hobbies7 = new Hobby("swimming", 3, addressListForSwimming, italy);
        Hobby hobbies77 = new Hobby("driving", 2, addressListForDriving, italy);
        List<Hobby> hobbyList7 = new ArrayList<>();
        hobbyList7.add(hobbies7);
        hobbyList7.add(hobbies77);

        p7.setListOfHobbies(hobbyList7);


        Hobby hobbies3 = new Hobby("dancing", 4, addressListForDancing, canada);
        Hobby hobbies33 = new Hobby("singing", 1, addressListForSinging, canada);
        List<Hobby> hobbyList3 = new ArrayList<>();
        hobbyList3.add(hobbies3);
        hobbyList3.add(hobbies33);

        p3.setListOfHobbies(hobbyList3);


        Map<Person, List<Hobby>> personToHobbies = new HashMap<>();
        personToHobbies.put(p7, hobbyList7);
        personToHobbies.put(p3, hobbyList3);
        System.out.print(personToHobbies);

        for (Map.Entry<Person, List<Hobby>> kv: personToHobbies.entrySet()){
            System.out.print(kv.getKey() + ": " + kv.getValue());
        }
            


    }
}



