package Homework3;

import java.util.Scanner;
public class ParityClass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = input.nextInt();
//        Перетворення числа а в двійкову систему
        String b_in=Integer.toBinaryString(a);
//        Перетворення двійкової строки в ціле число у вигляді двійкового коду
        int b=Integer.parseInt(b_in);
//        Перевірка молодшого розряду на рівність нулю
        if (b%10==0)
         System.out.println("це число парне");
        else
            System.out.println("це число парне");
    }
}