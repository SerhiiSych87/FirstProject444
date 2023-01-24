package Homework15.Task1;

import java.util.Scanner;

public interface Calc {

  public void Calculators ();

class Calculate implements Calc{

  @Override
  public void Calculators() {

    char operator;
    Double num1, num2, result;
    Scanner input = new Scanner(System.in);

    System.out.println("Калькулятор");

    System.out.println("Введіть перше число");
    num1 = input.nextDouble();

    System.out.println("Введіть мат_оператор: +, -, *, /");
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
        System.out.println("Невірний мат_оператор");
        break;
    }

  }

 }
}
