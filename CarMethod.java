
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarMethod {
    private static final String ALPHABETICAL_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void createAndSortACustomObjList() {
        //requirement 1: write 5 instances and add them to a list
        List<Car> carList = Stream
                .of(new Car("Tesla", "S", 1000, true, 79990),
                        new Car("Renault", "TWiZY", 570, false, 11800),
                        new Car("AUDI", "e-Tron", 1100, false, 74600),
                        new Car("Tesla", "X", 1400, true, 88190),
                        new Car("Nissan", "Leaf", 990, false, 41928))
                .collect(Collectors.toList());

        // req 2: find the elements
        System.out.println("Filtered list: ");
        carList.stream()
                .filter(car -> car.getBrand().contains("a"))
                .filter(car -> car.getBrand().startsWith("T"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // req 3: find the MIN
        System.out.println("Min: ");
        Comparator<Car> compareByBatteryLife =
                Comparator.comparing(Car::getBattery);
        Optional<Car> min = carList.stream().min(compareByBatteryLife);
        System.out.println(min);

        //req 8: sort in an order you consider
        System.out.println("Sorted list: ");
        Comparator<Car> compareByPrice =
                Comparator.comparing(Car::getPrice);
        carList.stream()
                .sorted(compareByPrice)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //req 9: matching a condition based on an Integer field
        System.out.println("AnyMatch ");
        boolean answer = carList.stream()
                .anyMatch(x -> x.getBattery() > 1000);
        System.out.println(answer);

        //req 10: Optional, check with ifPresent
        System.out.println("Explaining Optional: ");
        Optional<Boolean> autoPilot = Optional.of(true);

        Boolean answer1 = false;
        Boolean answer2 = null;
        autoPilot.ifPresent(System.out::println);
    }

    // req 4: generate random Strings and find MAX + explain
    //1. the method generate a set of Strings containing different length;
    //2. using a natural order to compare, the System will save first element in the set as MAX;
    //3. the system compare the "false" MAX with the rest of elements;
    //4. if a biggest number is found, this will be the new value of MAX;
    //5. the process is finished when no number greater than MAX is founded;
    static void generateStringsFindTheMax() {
        Set<String> randomStringSet = new HashSet<>(5);
        while (5 > randomStringSet.size()) randomStringSet.add(getString());
        System.out.println(randomStringSet);
        System.out.println(randomStringSet.stream().max(String::compareTo));
        
        //req 11: fastest way to find the shortest String
        System.out.println(randomStringSet.stream().min(String::compareTo));
    }
    private static String getString() {
        StringBuilder builder = new StringBuilder();
        int character = (int) (Math.random() * ALPHABETICAL_STRING.length());
        for (int i = 0; i <= character; i++) {
            builder.append(ALPHABETICAL_STRING.charAt(character));
        }
        return builder.toString();
    }

    // req 5: count number of integer and mapping
    public void generateIntegersCountAndMap() {
        List<Integer> integerList = Arrays.asList(57, 23, 44, 97);
        System.out.println((long) integerList.size());
        integerList.stream()
                .filter(Objects::nonNull)
                .map(x -> integerList.get(1) * Math.sqrt(2.0))
                .forEach(System.out::println);
    }

    // req 6: create a map and sort the elements
    public void sortAMap() {
        HashMap<String, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("start", 100);
        integerHashMap.put("drive", 85);
        integerHashMap.put("stop", 3);

        long count = integerHashMap.values()
                .stream()
                .filter(x -> x > 10)
                .count();
        System.out.println(count);
    }

    // req 7: reverse order
    public void sortInReverseOrder() {
        Set<String> stringSet = new HashSet<>(Arrays.asList("red", "blue", "white", "green"));

        stringSet.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


}




