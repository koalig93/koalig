package pingwit.hw_9.task_4_5;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -7854736839786955549L;

    private String name;
    private Integer age;
    public Work work;

    public Employee(String name, Integer age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", work=" + work +
                '}';
    }
}
