package Homework5;

import java.util.Scanner;
public class Hw5_Kvadrat2 {

    static void myMethod() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int a = input.nextInt();
        int b= (int) (Math.pow(a,2));
        int c = (int) b+2;
            System.out.print(b);
            System.out.print(" ");
            System.out.print(c);
        }
    public static void main(String[] args) {
        myMethod();

    }

}