package pingwit.hw_4.task_3;

import java.util.HashMap;
import java.util.Map;
import pingwit.hw_4.task_1.Person;

public class EqualPersonFinder {
    public static void main(String[] args) {

        Person[] persons = {new Person("Alex", 18), new Person("Alex", 28),
                new Person(), new Person("Alex", 18), new Person("Egorka", 28), new Person(),
                new Person("Alex", 28), new Person("Semen", 2),
                new Person("Egorka", 28), new Person("Egorka", 28)};

        Map<Person, Integer> equalPersonCounter = countEqualPersons(persons);

        for (Map.Entry<Person, Integer> personEntry : equalPersonCounter.entrySet()) {
            System.out.println(personEntry.getKey() + " : " + personEntry.getValue());
        }
    }

    private static Map<Person, Integer> countEqualPersons(Person[] persons) {
        Map<Person, Integer> result = new HashMap<>();

        for (Person person : persons) {
            result.merge(person, 1, Integer::sum);
        }
        return result;
    }
}
