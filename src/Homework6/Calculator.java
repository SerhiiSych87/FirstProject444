package Homework6;
import java.util.Scanner;
// створіть клас Calculator. Створіть метод з ім'ям calculate,
// який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
public class Calculator {
    static int[] calculatorArray() {
        int[] elements = new int[3]; // створив масив для внесення 3-х чисел з консолі
        int[] elements1 = new int[3]; // створив масив для тримання поділених чисел на 5
        Scanner input = new Scanner(System.in);
        elements[0] = input.nextInt(); // вношу кожнен елемент масиву - він же параметр методу
        elements[1] = input.nextInt();
        elements[2] = input.nextInt();
        elements1[0] = elements[0] / 5;  // ділю кожен елемент масиву
        elements1[1] = elements[1] / 5;
        elements1[2] = elements[2] / 5;
        return elements1;

    }

    public static void main(String[] args) {
        int[] elements2 = calculatorArray(); // ініалізую змінну - виклик методу
        for (int i:elements2) {              // цикл фор ич для виведення кожного елементу нашого масиву
            System.out.println(i);
        }

    }
}