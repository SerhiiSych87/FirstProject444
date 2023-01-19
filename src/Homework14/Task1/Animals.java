package Homework14.Task1;
public enum Animals {

    LION(10), HIPPO(5), ALLIGATOR(3), GIRAFFE(6), ZEBRA(7);
    int age;

    Animals(int age) { // конструктор що повертає вік тварини

        this.age = age;
    }

    public String toString() { // перевантажений метод

        return "Animal is " +super.toString()+", "+ "Age of animal is " + age;
    }
}

