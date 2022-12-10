import java.util.Scanner;

public class GoodMClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число");
        int timeof_day = input.nextInt();
        if (timeof_day > 0 && timeof_day < 12) {
            System.out.println("Добрий ранок");
        }else if (timeof_day >= 12 && timeof_day < 20) {
            System.out.println("Добрий день");
        }else if (timeof_day >= 20 && timeof_day <= 24) {
            System.out.println("Доброї ночі");
        }else{
            System.out.println("Невірний формат");
        }
    }
}