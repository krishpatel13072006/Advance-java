package _6_Multithreading.interrupt;

public class Myhthread extends Thread {

    Myhthread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

                Thread.sleep(1000); // Check for interrupt during sleep
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted during sleep");
        }

        // After catching exception, check if interrupted flag is cleared
        System.out.println("Is interrupted? " + Thread.currentThread().isInterrupted());
    }

    public static void main(String[] args) throws InterruptedException {
        Myhthread r1 = new Myhthread("T1");
        r1.start();



        r1.interrupt(); // Interrupt from main thread

        System.out.println("Main: isInterrupted = " + r1.isInterrupted()); // Likely true before sleep
        Thread.sleep(2000); // Wait for run() to continue
        System.out.println("Main: isInterrupted = " + r1.isInterrupted()); // Might be false if caught
    }
}
