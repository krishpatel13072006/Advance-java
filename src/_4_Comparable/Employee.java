package _4_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

    String name;
    int roll;

    public Employee(String name,int roll) {
        this.name = name;
        this.roll=roll;
    }

    public String name() {
        return name;
    }

    public int roll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
//        return this.roll() - o.roll();
//        return o.name.length() -this.name.length();

    }

    public static void main(String[] args) {
        List<Employee> x =new ArrayList<Employee>();
        x.add(new Employee("krish",91));
        x.add(new Employee("priya",61));
        x.add(new Employee("darshil",101));

        Collections.sort(x.reversed());
        for (Employee n: x)
        {
            System.out.println(n);
        }


    }
}
