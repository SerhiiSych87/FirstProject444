package Lessons;

public class Thread1 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        thread1.worker();
    }

    public synchronized void increment(){

        counter++;

    }

    public void worker() throws InterruptedException {

        Thread thread_one = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 25; i++) {

                    increment();

                }

            }
        });

        Thread thread_two = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 25; i++) {

                    increment();

                }

            }
        });

        thread_one.start();
        thread_two.start();
        thread_one.join();
        thread_two.join();

//        System.out.println(counter);

    }




}