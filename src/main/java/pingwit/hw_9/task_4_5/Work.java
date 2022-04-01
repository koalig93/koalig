package pingwit.hw_9.task_4_5;

import java.io.Serializable;

public class Work implements Serializable {

    private static final long serialVersionUID = -3699196701349241697L;

    public String name; // public -> private Не должно быть у класса public полей
    private Integer experience;

    public Work(String name, Integer experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
