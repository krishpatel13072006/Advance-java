package _5_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

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


    public static void main(String[] args) {
        List<Employee> x =new ArrayList<Employee>();
        x.add(new Employee("krish",91));
        x.add(new Employee("priya",61));
        x.add(new Employee("darshil",101));

        Collections.sort(x,new Marks());

//        Collections.sort(x,new name());

        for (Employee n: x)
        {
            System.out.println(n);
        }

    }
}
class name implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if (o2.name().length() - o1.name().length() < 0) {
            return -1;
        } else if (o2.name().length() - o1.name().length() > 0) {

            return 1;
        } else {
            return 0;
        }
    }
}

class Marks implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {

        return o1.roll() - o2.roll();
    }

}