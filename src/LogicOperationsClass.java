import java.util.Scanner;
public class LogicOperationsClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 5, y = 10, z = 15;
        System.out.println(x += y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println( y /= x + 5 | z);
        System.out.println( z = x++ & y * 5);
        System.out.println( x = y << x++ ^ z);

    }
}