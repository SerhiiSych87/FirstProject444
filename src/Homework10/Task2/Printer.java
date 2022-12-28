package Homework10.Task2;

public class Printer {

    static final String reset = "\u001b[0m";
    static final String black = "\u001b[30m";
    static final String red = "\u001b[31m";
    static final String green = "\u001b[32m";
    static final String yellow = "\u001b[33m";
    static final String blue = "\u001b[34m";
    static final String purple = "\u001b[35m";
    static final String cyan = "\u001b[36m";
    static final String white = "\u001b[37m";


    public static void main(String[] args) {

               print (red);

    }
    public static String print (String color){

        for (int i = 0; i < 20; i++) {

            System.out.print(color + "\u058D");
        }

        System.out.println();
        return color;
    }


}
