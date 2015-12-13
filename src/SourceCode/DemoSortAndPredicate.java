import java.util.Arrays;
import java.util.Comparator;

public class DemoSortAndPredicate {

    public static void main(String[] args) {
        // Demonstration Sorting of Persons 

        Person[] persons = new Person[5];

        persons[0] = new Person("Vasya Pupkin", 1, 1, 1993);
        persons[1] = new Person("Igor Prokopovich", 1, 4, 1995);
        persons[2] = new Person("John Doe", 16, 10, 1994);
        persons[3] = new Person("John Jefferson", 9, 2, 1992);
        persons[4] = new Person("Stephan Wozniak", 6, 6, 1994);

        Arrays.sort(persons);

        for (Person item : persons) {
            System.out.println("Name: " + item.getName() +
                                " Age: " + item.getAge() +
                                " docNumber: " + item.getDocNumber());
        }
        System.out.println();

        Arrays.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person first, Person second) {
                return first.getName().compareTo(second.getName());
            }
        });
        for (Person item : persons) {
            System.out.println("Name: " + item.getName() +
                    " Age: " + item.getAge() +
                    " docNumber: " + item.getDocNumber());
        }

        // Demonstration Predicate
        Integer[] elems = {1, 2, 3, 4, 5, 6};
        
        Integer[] searchElems = ArrayUntil.selectValues(null, new Predicate<Integer>() {

            @Override
            public boolean checkCondition(Integer obj) {
                if ((obj % 2) == 0)
                    return true;
                else {
                    return false;
                }
            }
        });
        int counter = 1;

        for (Integer item : searchElems) {
            System.out.format("Item %d: %d%n", counter++, item);
        }
    }
}
