package Homework3;

import java.util.Scanner;
public class IntervalClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = input.nextInt();
        if (a>=0 && a<=14)
            System.out.println("Число знаходиться в першому діапазоні");
        else if (a>=15 && a<=35)
            System.out.println("Число знаходиться в другому діапазоні");
        else if (a>=36 && a<=50)
            System.out.println("Число знаходиться в третьому діапазоні");
        else if (a>=51 && a<=100)
            System.out.println("Число знаходиться в четвертому діапазоні");
        else  System.out.println("Число не входить ні в один діапазон");
    }


}
