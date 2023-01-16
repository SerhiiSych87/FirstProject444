package Homework5;

import java.util.Scanner;
public class Hw5_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            while (true) {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
                int[] arr1 = new int[12];
                int[] result = new int[12];
                for (int i = 0; i < arr.length+1; i++) {
                    result[i] = result [i] + i + 1;
                    System.out.print(result[i]);
                    System.out.print(" ");
                                    }
                break;
            }

    }
}
