package Homework5;

import java.util.Scanner;
public class Hw_5_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int  a = in.nextInt();
        int [] f  = new int [a];
        f [0] = 0;
        f [1] = 1;
        System.out.print(f[0]);
        System.out.print(" ");
        for (int i = 2; i < a-1; ++i) {
              f [i] = f[i-1] + f[i-2];
              System.out.print(f[i]);
              System.out.print(" ");
            }


            }

        }


