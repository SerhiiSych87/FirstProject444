import java.util.Scanner;
public class Case6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число одиниці виміру довжини");
        System.out.println("1-дециметр, 2-кілометр, 3-метри, 4-міліметри, 5-сантиметри");
        int units = input.nextInt();
        System.out.println("Введіть довжину");
        double lenght = input.nextDouble();
        switch (units){
            case 1:
                double dm = lenght*0.1;
                System.out.println(dm);
                break;
            case 2:
                double km = 1000*lenght;
                System.out.println(km);
                break;
            case 3:
                double m = 1*lenght;
                System.out.println(m);
                break;
            case 4:
                double mm = lenght/1000;
                System.out.println(mm);
                break;
            case 5:
                double cm = lenght/100;
                System.out.println(cm);
                break;
            default:
                System.out.println("Невизначена одиниця виміру");


        }
    }
}
