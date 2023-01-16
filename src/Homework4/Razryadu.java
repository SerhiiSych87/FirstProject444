package Homework4;

import java.util.Scanner;
public class Razryadu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число");
        long a = in.nextLong();
        System.out.println("Введіть число рядків");
        do {
            int d = (int) a%10;
            System.out.println(d);
            a /= 10;
        }while (a!=0);
        }
    }
