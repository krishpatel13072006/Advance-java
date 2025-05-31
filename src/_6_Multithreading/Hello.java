package _6_Multithreading;

public class Hello extends Thread{

    @Override
    public void run()
    {
        for ( ; ; ) {
//            System.out.println(Hello.currentThread().getName());
            System.out.println("Hello");
        }
    }
}
