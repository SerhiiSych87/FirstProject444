package Homework5;

import java.util.Scanner;
public class Hw5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,2,3,4};
        int [] arr1 = {1,2,3,4,5};
        int [] result = new int [4];
        for (int i = 0; i<result.length; i++) {

            result [i] = arr[i]+arr1[i];
            System.out.println(result[i]);

            }
        }


        }