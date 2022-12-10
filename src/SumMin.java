import java.util.Scanner;
public class SumMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введіть два числа a i b (a<b)");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a+1; i<b; i++) {
             counter+=i;
             if (i%2!=0) System.out.println(i);
        }
            System.out.println("Suma chisel promizhku = " + counter);
    }
}