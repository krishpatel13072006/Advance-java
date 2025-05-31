package _6_Multithreading._lifecycle;

public class mythread extends Thread{

    @Override
    public void run(){
        System.out.println("Running");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)throws InterruptedException {
        mythread t1=new mythread();//created new thread
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(100);//makes main thread to sleep so that t1 thread comes to running state

        //calling sleep method in runMethod so that t1 thread waits for cpu
        System.out.println(t1.getState());

        t1.join();//waits for t1 thread to completed its execution and then terminates it.
        System.out.println(t1.getState());

    }
}
