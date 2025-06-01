package _7_Lambda_expressions;

public class Main {

    public static void main(String[] args) {

        Runnable thread1=()->{

            for (int i = 0; i <=10; i++) {

                System.out.println(Thread.currentThread().getName() +" " +i);

                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }

        };

        Runnable thread2=()->{

            for (int i = 0; i <=10; i++) {

                System.out.println(Thread.currentThread().getName() +" " +i);

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }

        };

        Thread t1=new Thread(thread1);
        t1.setName("t1");
        t1.setDaemon(true);
        t1.start();

        Thread t2=new Thread(thread2);
        t2.setName("t2");
        t2.start();

    }
}
