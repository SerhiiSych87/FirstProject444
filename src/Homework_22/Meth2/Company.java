package Homework_22.Meth2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Company extends Holding implements Serializable {
    int headCount;
    String owner;
    transient Employee empl;

    Company(int state, int headCount, String owner, Employee empl) {

        super(state);
        this. headCount =  headCount;
        this.owner = owner;
        this.empl = empl;
    }

    // Використання методу для запису того що не можемо сереалізувати (transient)

    private void writeObject(ObjectOutputStream oist) {
        try {
            // звичайний спосіб
            oist.defaultWriteObject();
            oist.writeInt(empl.age);
            oist.writeObject(empl.name);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void readObject(ObjectInputStream oit) {
        try {
            // звичайний спосіб зчитування
            oit.defaultReadObject();
            this.empl = new Employee(oit.readInt(), (String) oit.readObject());

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Holding {

    // Superclass Holding with constructors
    int state = 900;

    Holding() {

    }

    Holding(int state) {
        this.state = state;
    }
}