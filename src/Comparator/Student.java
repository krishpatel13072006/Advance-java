package Comparator;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;




public class Student {

    public String name;
    public int marks;
    public char blood;

    public Student(String name,int marks, char blood) {
        this.name = name;
        this.marks=marks;
        this.blood=blood;

    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", blood=" + blood +
                '}';
    }

    public char getBlood() {
        return blood;



    }

    public static void main(String[] args) {

        List<Student> obj=new ArrayList<>();
        obj.add(new Student("Amit",123,'A'));
        obj.add(new Student("MUKESH",150,'C'));
        obj.add(new Student("CRISH",12,'B'));

//        Collections.sort(obj,new markscompare());
//        Collections.sort(obj,new compareblood());
        Collections.sort(obj,new comparename().reversed());
        for (Student s1: obj)
        {
            System.out.println(s1.toString());
        }


    }
}

class markscompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getMarks() - o2.getMarks();
    if(o2.getMarks() - o1.getMarks() > 0)
    {
        return 1;
    } else if (o1.getMarks() - o2.getMarks() < 0) {

        return  -1;
    }else{
        return 0;
    }
    }

}

class compareblood implements Comparator<Student>
{

    @Override
    public int compare(Student o1,Student o2) {
        return (o2.getBlood() - o1.getBlood());
    }
}

class comparename implements Comparator<Student>
{

    @Override
    public int compare(Student o1,Student o2) {
        return o1.getName().length() - o2.getName().length();
    }
}