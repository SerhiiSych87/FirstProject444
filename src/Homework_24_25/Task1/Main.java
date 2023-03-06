package Homework_24_25.Task1;

// Створити 2 класи. Реалізувати взаємне блокування цих класів.

public class Main {

    public static void main(String[] args) {

        // створюємо два обєкти наших класів

        FirstThread thread1 = new FirstThread();

        SecondThread thread2 = new SecondThread();

        // перевизначаємо метод run в якому реалізуємо звернення за посиланням обєкта до метода першого класу, а в
        //параметри передаємо обєкт другого класу, метод намагається викликати метод першого класу а другий - першого


        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.meth1_1(thread2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.meth2_1(thread1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // робимо перехрещення двох потоків.

        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run2);

        // запускаємо їх одночасно

        th1.start();
        th2.start();


        System.out.println("Якщо обидва потоки будуть виконувати власні методи одночасно, може виникнути deadlock");

        // Якщо обидва потоки будуть виконувати власні методи одночасно, може виникнути deadlock,
        // тому що кожен метод намагається заблокувати свій власний об'єкт, перш ніж викликати метод другого класу.

    }

}
