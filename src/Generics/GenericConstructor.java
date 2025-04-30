package Generics;

public class GenericConstructor{


    public <t> GenericConstructor(t name)
    {
        System.out.println(name);
    }

    public static void main(String[] args) {

        System.out.println();

        GenericConstructor x=new GenericConstructor("krish");

        System.out.println();

        GenericConstructor x1=new GenericConstructor(123);



    }
}
