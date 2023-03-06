package Homework_24_25.Task2;

//  Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази

import java.util.Scanner;
public class CalculatorLambda {
        interface DoubleMath {
            double procedure (double a, double b);
        }
        public double calculator (double a, double b, DoubleMath proc) {return proc.procedure(a, b);}

        // створюємо окремий метод, для зчитування двох змінних за допомогою обєкта класу сканер та записує їх в масив
    public double[] readNum(Scanner input) {
        System.out.println("Please enter two numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        return new double []{a, b};
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            CalculatorLambda calc = new CalculatorLambda();
            // Використовуємо лямбда-вирази для опису математичних операцій

            DoubleMath add = (a, b) ->  (a + b);
            DoubleMath sub = (a, b) -> (a - b);
            DoubleMath div = (a, b) ->  (a / b);
            DoubleMath mult = (a, b) ->  (a * b);

            double [] numbers = calc.readNum(input);
            // робимо вивід до консолі, звертаючись до наших введених чисел з масиву та методу що приймає операцію

            System.out.println(numbers[0] + " + " + numbers[1] + " = " + calc.calculator(numbers[0], numbers[1], add));
            System.out.println(numbers[0] + " - " + numbers[1] + " = " + calc.calculator(numbers[0], numbers[1], sub));
             System.out.println(numbers[0] + " / " + numbers[1] + " = " + calc.calculator(numbers[0], numbers[1], div));
             System.out.println(numbers[0] + " * " + numbers[1] + " = " + calc.calculator(numbers[0], numbers[1], mult));
        }
    }
