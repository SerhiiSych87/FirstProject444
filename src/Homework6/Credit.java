package Homework6;
import java.util.Scanner;

public class Credit {
    // Програма визначення суми погшашення кредиту
    static int MyCredit(int a) {
        int c = 700;
        int b = c - a; // zalushok po kredity

        if (b > 0) {
            System.out.print("Сума заборгованості складає ");
            c=b;
            return b;
        } else if (b < 0) {
            System.out.print("Сума переплати складає =  ");

            return Math.abs(b);
        } else {
            System.out.println("Борг по кредиту відсутній");
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть суму внесеного платежу по кредиту");
        System.out.println("Рекомендований щомісячний платіж дорівнює 100 грн");
        int a = input.nextInt();
        int kRedit = MyCredit(a);
        System.out.println(kRedit);
        while (kRedit>0){
            System.out.println("Введіть наступну суму внесеного платежу по кредиту");
            int d = input.nextInt();
            kRedit=kRedit-d;
            System.out.println(kRedit);
            if (kRedit==0){
                System.out.println("Борг по кредиту відсутній");
            }
        }}
}

