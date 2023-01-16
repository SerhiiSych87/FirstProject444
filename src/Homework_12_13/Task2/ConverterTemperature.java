package Homework_12_13.Task2;

import java.util.Scanner;

public interface ConverterTemperature {

    public void convert();
}
class Converter implements  ConverterTemperature{

    @Override
    public void convert() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees Celsius, &C");
        double G = input.nextDouble();
        System.out.println("Перевід градусів Цельсія в градуси по Кельвіну");
        double K = G+273.15;
        double F = G*1.8+32;
        System.out.println("Kelvin degrees = "+" "+K+"K");
        System.out.println("______________________");
        System.out.println("Перевід градусів Цельсія в градуси по Фаренгейту");
        System.out.println("Degrees Fahrenheit = "+" "+F+"F");
        System.out.println("______________________");

    }
}

class Main{

    public static void main(String[] args) {

        Converter conv1 = new Converter();

        conv1.convert();
    }
}
