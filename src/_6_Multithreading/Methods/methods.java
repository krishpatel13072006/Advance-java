package _6_Multithreading.Methods;

public class methods extends Thread{

    public methods(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//           e.printStackTrace();
//        }

        int i=1;
        while(i<=5)
        {
            System.out.println(Thread.currentThread().getName()+" "+"hello");
            i++;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        Thread.yield();

    }

    public static void main(String[] args) throws InterruptedException {
        methods t1=new methods("krish");
        t1.start();
        System.out.println(t1.getState());
        t1.setPriority(1);
        System.out.println(t1.getPriority());

        methods t2=new methods("paro");
        t2.start();
        System.out.println(t2.getState());

        t1.join();
        System.out.println(t1.getName()+" "+t1.getState());

        Thread.sleep(100);
        Thread.yield();
        System.out.println("world");
    }
}
