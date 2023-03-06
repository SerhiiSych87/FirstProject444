package Lessons;

public class Thread2 {

        private int counter;

        public static void main(String[] args) throws InterruptedException {

            Thread2 thread1 = new Lessons.Thread2();
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

                        System.out.println("i " + i);

                        increment();

                    }

                }
            });

            Thread thread_two = new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 25; j++) {

                        System.out.println("j " + j);

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