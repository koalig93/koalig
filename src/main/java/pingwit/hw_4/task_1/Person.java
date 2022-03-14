package pingwit.hw_4.task_1;

import java.util.Objects;

// +
public class Person {

    private static String text = "Hello from static";

    private final String name;
    private final Integer age;

    public Person() {
        this("Newborn", 0);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void show() {
        System.out.println(this);
    }

    public void showText() {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
