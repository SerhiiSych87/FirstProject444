package Homework10.Task2;

import static Homework10.Task2.Printer.*;

public class Main {

    public static void main(String[] args) {

        ColorPrinter printer1 = new ColorPrinter(black);


        String object = new ColorPrinter(white).toString();
        object = "Slava Ukraini";

        String objectUp = object;
        objectUp.getClass();


        System.out.println(printer1.print(red));

        System.out.println(object);

        System.out.print(print(blue));
        System.out.print(print(blue));
        System.out.print(print(blue));
        System.out.print(print(yellow));
        System.out.print(print(yellow));
        System.out.print(print(yellow));
    }

    }

