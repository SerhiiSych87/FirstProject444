package Homework4;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість рядків трикутника");
        int a = in.nextInt();
        for (int i = 1; i<=a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}