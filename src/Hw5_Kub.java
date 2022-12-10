import java.util.Scanner;
public class Hw5_Kub {

    static void myMethod() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int a = input.nextInt();
        int b= (int) (Math.pow(a,3));
        System.out.print(b);
    }
    public static void main(String[] args) {
        myMethod();

    }

}