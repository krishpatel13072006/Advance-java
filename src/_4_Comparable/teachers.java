package _4_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class teachers implements Comparable<teachers> {

    private String name;
    private int age;
    private int roll;

    public teachers(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public int roll() {
        return roll;
    }

    @Override
    public String toString() {
        return "teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }

    @Override
    public int compareTo(teachers o1)
    {
//        return this.name.length()-o1.name.length();
//        return this.age-o1.age;
        return this.name.compareTo(o1.name);
    }
    public static void main(String[] args) {
        LinkedList<teachers> obj=new LinkedList<>();
        obj.add(new teachers("krish",25,101));
        obj.add(new teachers("meenakshi",20,991));
        obj.add(new teachers("priya", 21,220));

        Collections.sort(obj);
//        System.out.println(obj);
        for (teachers n:obj)
        {
            System.out.println(n.age());
        }
    }
}
