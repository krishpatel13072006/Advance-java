package Generics;

public class GenericMethod {

    <t>GenericMethod(t var)
    {
        System.out.println(var);

    }

    public <t> void show(t value)
    {
        System.out.println(value);
    }


    public static void main(String[] args) {

        GenericMethod obj=new GenericMethod(1);
        obj.show("krish");
        obj.show(123);


    }
}
