package Homework6;
public class DostavkaTovaru {
    static int countofvariants(int N) {
        if (N == 0)
            return 1;
        else
            return N * countofvariants(N - 1);
    }

    public static void main(String[] args) {
        int countofvariants = countofvariants(6); // ініціалізуємо змінну 6 в метод з рекурсією
        System.out.print("Кількість можливих варіантів для доставки 6 клієнтам = " );
        System.out.println(countofvariants);
    }
}
