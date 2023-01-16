package Test;

import java.util.Scanner;

public class FivechClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть п'ятизначне число");
        int a = input.nextInt();
        int b = a / 10000 + a/1000%10 + a/100%10 + a/10%10 + a%10;
                System.out.println(b);
    }
}