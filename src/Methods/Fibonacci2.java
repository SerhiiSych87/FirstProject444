import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number Fibonachi");
        int number = scanner.nextInt();
        int temp = 0;
        int first = 1;
        for (int i = 2; i <= number; ++i) {
            int next = temp + first;
            temp = first;
            first = next;
        }
        System.out.println(first);
    }
}