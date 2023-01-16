package Homework5;

import java.util.Scanner;
public class Hw5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[12];
        int[] result = new int[12];
        int[] result1 = new int[12];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] + 1 + i;
            System.out.print(result[i]);
            System.out.print(" ");
             if (result[i] == Math.pow(2, 0) || result[i] == Math.pow(2, 1) || result[i] == Math.pow(2, 2) || result[i] == Math.pow(2, 3)) ;
            {
                result1[i] = (int)(Math.pow(2,i));
                System.out.print(result1[i]);
                System.out.print(" ");
                System.out.print("\n");
            }
     }
//
        }
    }
