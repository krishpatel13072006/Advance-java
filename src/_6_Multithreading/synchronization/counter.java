package _6_Multithreading.synchronization;

public class counter {

    public int count=0;
    public int value=3000;

    public  void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getcount()
    {
        return count;
    }


    public synchronized void decrement()
    {
        value--;
    }

    public int getvalue()
    {
        return value;
    }






}
