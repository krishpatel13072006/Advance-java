package _6_Multithreading.demon_Thread;

public class Mythread extends Thread{

    Mythread(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <=10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

                Thread.sleep(2000);
//                Thread.yield();

            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Mythread t1=new Mythread("Thread 1");
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());

        for (int i = 0; i <=5; i++) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
//        Mythread t2=new Mythread("Thread 2");
//        t2.start();


    }
}
