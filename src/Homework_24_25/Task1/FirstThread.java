package Homework_24_25.Task1;

// Створити 2 класи. Реалізувати взаємне блокування цих класів.

public class FirstThread {

    public final String NUMBEROFTHREAD = "First ";

    public FirstThread() {
    }

    // створюємо синхронізовані методи, що взаємодіють між собою

    public synchronized void meth1_1 (SecondThread thread2) throws InterruptedException {

        System.out.println(NUMBEROFTHREAD + "method from FirstThread Class");

        Thread.sleep(1500); // потік засипає на 1,5 с

        System.out.println("FirstThread meth1_1 викликає другий метод другого класу SecondThread meth2_2");

        thread2.meth2_2();

    }

    public synchronized void meth1_2 (){

        System.out.println("Second method from FirstThread Class");

    }


}
