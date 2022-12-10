import java.util.Scanner;
public class For4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = b-1; i>=a; i--) {

            System.out.println(i);
        }
    }
}