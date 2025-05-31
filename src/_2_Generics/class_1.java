package _2_Generics;

public class class_1<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        class_1<Integer> x=new class_1<>();
        x.setValue(123);
        System.out.println(x.getValue());

        class_1<String> s1=new class_1<>();
        s1.setValue("hello");
        System.out.println(s1.getValue());

        /*it will gives compilation error
        s1.setValue(123);*/



    }
}