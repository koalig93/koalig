package pingwit.hw_4.task_3;

import java.util.HashMap;
import java.util.Map;
import pingwit.hw_4.task_1.Person;

public class EqualPersonFinder {
    public static void main(String[] args) {

        // некрасиво, каждого персонажа с новой строки, а то 2 на строке, потом 4, фу. Пример:
        // Person[] persons = {
        //          new Person("Alex", 18),
        //          new Person("Alex", 28)
        //          }
        Person[] persons = {new Person("Alex", 18), new Person("Alex", 28),
                new Person(), new Person("Alex", 18), new Person("Egorka", 28), new Person(),
                new Person("Alex", 28), new Person("Semen", 2),
                new Person("Egorka", 28), new Person("Egorka", 28)};

        Map<Person, Integer> equalPersonCounter = countEqualPersons(persons);

        // можно просто System.out.println(equalPersonCounter); и тоже будет красиво
        for (Map.Entry<Person, Integer> personEntry : equalPersonCounter.entrySet()) {
            System.out.println(personEntry.getKey() + " : " + personEntry.getValue());
        }
    }

    private static Map<Person, Integer> countEqualPersons(Person[] persons) {
        /*
        решение через стримы, просто для познания
         Map<Person, Long> collect = Arrays.stream(persons)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        */
        Map<Person, Integer> result = new HashMap<>();

        for (Person person : persons) { // первый раз вижу такой выбор, обычно через if(result.contains) {...}
            result.merge(person, 1, Integer::sum);
        }
        return result;
    }
}
