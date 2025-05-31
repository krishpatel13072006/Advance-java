package _6_Multithreading.Methods;

public class methods_2 extends Thread {

    public methods_2(String name)
    {
        super(name);
    }

    @Override
    public void run() {

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);



            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.yield();
    }

    public static void main(String[] args)throws InterruptedException {
        methods_2 t1=new methods_2("t1");
        t1.start();
        t1.setPriority(1);
        System.out.println(t1.getState()+" "+t1.getPriority());

        methods_2 t2=new methods_2("t2");
        t2.start();
        t2.setPriority(2);
        System.out.println(t2.getState()+" "+t2.getPriority());

        System.out.println("Main thread is in waiting state");
        Thread.sleep(5000);
        System.out.println("Main thread is in running state");

        t1.join();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());





    }
}
