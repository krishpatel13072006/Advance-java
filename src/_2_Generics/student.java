package _2_Generics;

public class student<T> implements name<T> {

    public T value;

    public T getname() {
        return value;
    }

    public void setname(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        student<String> s=new student<>();
        s.setname("krish");
        System.out.println(s.getname());

        student<Integer> s1=new student<>();
        s1.setname(12);
        System.out.println(s.getname());
    }
}
