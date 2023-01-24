package Homework15.Task2;

public class Main2 {
    static void checkPIN(int pin) {
        int a = pin/1000;
        int b = pin%1000 / 100;
        int c = pin%100/10;
        int d = pin%10/1;

        if (a+b==c+d) { // checking for the identity of the numbers in the pincode

                throw new ArithmeticException("Dear client your pincode is too easy and contains the same numbers");

            }

            else {

                System.out.println("Everything is fine, you can continue to work");

            }
        }

        public static void main(String[] args) {

            checkPIN(7776); // Set your PIN with the same numbers  -to show the error

        }

    }

