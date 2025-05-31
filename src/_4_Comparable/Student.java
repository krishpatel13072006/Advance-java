package _4_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Student implements Comparable<Student> {

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


//    public int compareTo(Student o) {
//        return this.marks - o.marks;
//    }

//    public int compareTo(Student o) {
//        return  (o.blood-this.blood) ;
//    }

    public int compareTo(Student o) {
//        return this.name.length() - o.name.length();

        return (this.name.compareTo(o.name));
    }

    public static void main(String[] args) {

        List<Student> obj=new ArrayList<>();
        obj.add(new Student("Amit",123,'A'));
        obj.add(new Student("MUKESH",150,'C'));
        obj.add(new Student("CRISH",12,'B'));

        Collections.sort(obj.reversed());
        for (Student s1: obj)
        {
            System.out.println(s1.toString());
        }

          }
    }


