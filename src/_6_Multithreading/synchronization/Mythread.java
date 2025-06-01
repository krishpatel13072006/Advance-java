package _6_Multithreading.synchronization;

public class Mythread extends Thread {

    counter obj;
    public Mythread(counter obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            obj.increment();
            obj.decrement();
        }
    }

    public static void main(String[] args)throws InterruptedException {
       counter ob=new counter();
       Mythread t1=new Mythread(ob);
       Mythread t2=new Mythread(ob);
       Mythread t3=new Mythread(ob);
       t1.start();
       t2.start();
       t3.start();

       t1.join();
       t2.join();
       t3.join();

        System.out.println(ob.getcount());
        System.out.println(ob.getvalue());
    }
}
