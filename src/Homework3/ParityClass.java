package Homework3;

import java.util.Scanner;
public class ParityClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = input.nextInt();
        if (a%2==0)
            System.out.println("Число є парним");
        else  System.out.println("Число непарне");
    }


}
