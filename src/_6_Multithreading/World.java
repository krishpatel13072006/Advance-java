package _6_Multithreading;

public class World {


    public static void main(String[] args) {
        Hello obj=new Hello();
        Thread t1=new Thread(obj);
        t1.start();

        for ( ;   ; ) {
            System.out.println("world");
        }



    }
}
