package Homework2;

import java.util.Scanner;
public class CalcClass {
public static void main(String[] args) {
    char operator;
    Double num1, num2, result;
    Scanner input = new Scanner(System.in);

    System.out.println("Введіть перше число");
    num1 = input.nextDouble();

    System.out.println("Мат_оператор: +, -, *, /");
    operator = input.next().charAt(0);

    System.out.println("Введіть друге число");
    num2 = input.nextDouble();

    switch (operator) {
        case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
        case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
        case '/':
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;
default:
        System.out.println("неверный мат опер6атор");
        break;
        }

        }
        }