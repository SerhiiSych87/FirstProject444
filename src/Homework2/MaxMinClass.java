package Homework2;

import java.util.Scanner;

public class MaxMinClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть три числа");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max=0;
        int min=0;
        int ser=0;
        if (a>b&&a>c) max=a;
        if (b>a&&b>c) max=b;
        if (c>b&&c>a) max=c;
        if (a<b&&a<c) min=a;
        if (b<a&&b<c) min=b;
        if (c<a&&c<b) min=c;
        if (a>b&&a<c || a<b&&a>c) ser=a;
        if (b>a&&b<c || b<a&&b>c) ser=b;
        if (c>a&&c<b || c<a&&c>b) ser=c;
        System.out.println(max);
        System.out.println(min);
        System.out.println(ser);

    }
}