package Homework5;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,2,3};
        int [] arr1 = {2,3,5};
        int [] result = new int [3];
        for (int i = 0; i<result.length; i++) {
            result [i] = arr[i]+arr1[i];
            System.out.println(result[i]);
        }
    }
}