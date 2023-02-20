package Homework21.Task1;

//Напишіть програму, яка виводитиме всю інформацію про клас

import java.util.Arrays;

import Homework21.Task1.HeadClass.Subordinate;

public class InfoAboutClass {

    public static void infoClass_about (Object o){


        Class informer = o.getClass(); // створюємо обєкт класу Клас що приймає наш клас

        System.out.println("We can get info about our classes using reflection" + (char) 27 + "[34m");

        // за допомогою методів рефлексії отримуємо інформацію про наш клас HeadClass

        System.out.println("Name of class is: " + informer);


        System.out.println("Fields of class are: " + Arrays.toString(informer.getDeclaredFields()));


        System.out.println("Methods are: " + Arrays.toString(informer.getDeclaredMethods()));


        System.out.println("Constructors are: " + Arrays.toString(informer.getConstructors()));

        System.out.println("Modifiers: " + informer.getModifiers());


    }

    public static void main(String[] args) {

        // звертаємось до методу та переваємо в якості параметра обєкт нашого дочірнього класу з параметрами полів

        infoClass_about(new Subordinate("Teacher - Dmitro Krasnui",1,1));
    }

}
