package Homework11;

import java.sql.SQLOutput;

public class Calc {


    public static class InCalc1 extends Calculate {

        public int getMin(){

            return Min1(10);
        }

        public int getAverage(){

            return Average1(12);
        }
        public int getMax(){

            return Max1(15);
        }

    }

    public static void main(String[] args) {

        Calc.InCalc1 myCalc =  new Calc.InCalc1();

        System.out.println(myCalc.getMin());
        System.out.println(myCalc.getAverage());
        System.out.println(myCalc.getMax());


    }

}