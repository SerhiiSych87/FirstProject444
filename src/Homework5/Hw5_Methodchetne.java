package Homework5;

import java.util.Scanner;
public class Hw5_Methodchetne {

    static void myMethod() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int a = input.nextInt();
        if (a%2==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        myMethod();

    }

}