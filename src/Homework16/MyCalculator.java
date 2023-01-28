package Homework16;

import java.util.Scanner;

class MyCalculator <T> {

    public T add(T a, T b) {

            if (a.getClass().equals(Integer.class)) {
                return (T) (Object) ((Integer) a + (Integer) b);
            }

            if (a.getClass().equals(Double.class)) {
                return (T) (Object) ((Double) a + (Double) b);
            }

        return (T) (Object) 0;
    }
    public T sub (T a, T b) {

        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a - (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a - (Double) b);
        }

        return (T) (Object) 0;
    }

    public T mul(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a * (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a * (Double) b);
        }

        return (T) (Object) 0;
    }

    public T div(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a / (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a / (Double) b);
        }

        return (T) (Object) 0;
    }
}

    class Main2 {
        public static void main(String[] args) {
            try {
                MyCalculator<Integer> calc1 = new MyCalculator<>();
                Scanner input = new Scanner(System.in);
                System.out.println("Enter first number");
                int num1 = input.nextInt();
                System.out.println("Enter second number");
                int num2 = input.nextInt();
                int add = calc1.add(num1, num2);
                System.out.println(add);
                MyCalculator<Double> calc2 = new MyCalculator<>();
                System.out.println("Enter third number");
                double num3 = input.nextDouble();
                System.out.println("Enter fours number");
                double num4 = input.nextDouble();
                double div = calc2.div(num3, num4);
                System.out.println(div);
            }catch (Exception e){
                System.out.println("Invalid entered data format");
            }
        }
    }
