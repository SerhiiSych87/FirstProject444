package Test;

import java.util.Scanner;
public class For10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = (double) (S + 1.0 / i);
        }
        System.out.println(S);
    }
}