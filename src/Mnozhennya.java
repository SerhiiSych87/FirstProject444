import java.util.Scanner;
public class Mnozhennya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = in.nextInt();
        int b;
        for (int i = 1; i<=9; i++) {
            b=i*a;
            System.out.println(a+"*"+i+"="+b);
        }

    }
}