import java.util.Scanner;

public class ClassMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть два числа число");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.max(a,b));
    }
}