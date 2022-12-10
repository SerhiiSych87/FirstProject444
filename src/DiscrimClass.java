import java.util.Scanner;

public class DiscrimClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть три числа");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double D = b*b-(4*a*c);
        if (D<0) {
            System.out.println("Дискримінант не має рішень");
        }else if (D==0){
            double x=(-b/2*a);
            System.out.println(x);
        }else if (D>0){
            double x = (-b+Math.sqrt(D))/2*a;
            System.out.println(x);
        }
    }
}