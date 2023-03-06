package Homework_24_25.Task1;

// Створити 2 класи. Реалізувати взаємне блокування цих класів.

public class SecondThread {

    public final String NUMBEROFTHREAD = "First ";

    public synchronized void meth2_1 (FirstThread thread1) throws InterruptedException {

        System.out.println(NUMBEROFTHREAD + "method from SecondThread Class");

        Thread.sleep(1500); // потік засипає на 1,5 с

        System.out.println("SecondClass meth2_1 викликає другий метод першого класу FirstThread  meth1_2");

        thread1.meth1_2();

    }

    public synchronized void meth2_2 (){

        System.out.println("Second method from FirstThread Class");

    }


}


