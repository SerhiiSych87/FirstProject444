package Homework21.Task3_Reflection;

//** Створіть 2 класи,  та . У класі  ініціалізуйте 3 поля різних модифікаторів.
// У класі Cat використовуючи reflection, отримайте доступ до полів класу та змініть вміст кожного з полів.

import java.lang.reflect.Field;

public class Cat {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Animals animal1 = new Animals(); // створимо обєкт класу Animals

        String s1 = (char) 27 + "[34m";
        String s2 = (char) 27 + "[35m";
        String s3 = (char) 27 + "[39m";

        String name = null;  // ставимо за замовчування null нашим обєктам
        String kindOfAnimal = null;
        String typeOfAnimal = null;

        Field field = animal1.getClass().getDeclaredField("name");  // повертаємо масив полів класа (всіх модифікаторів) по імені поля

        field.setAccessible(true); // метод дозволяє нам працювати далі з полем

        field.set(animal1, (String) "British breed"); // задаємо нове значення з вказанням обьєкта

        name = (String) field.get(animal1); // кастимо наш обєкт до String і вказуємо нашій змінній

        System.out.println();

        System.out.println("New value of name will be: " + name + s1); // виводимо до консолі


        // Повторюємо наші дії для 2-х інших наших полів

        Field field1 = animal1.getClass().getDeclaredField("kindOfAnimal");

        field1.setAccessible(true);

        field1.set(animal1, (String) "Chordata");

        kindOfAnimal = (String) field1.get(animal1);

        System.out.println("New value of kindOfAnimal will be: "+ kindOfAnimal + s2);

        Field field2 = animal1.getClass().getDeclaredField("typeOfAnimal");

        field2.setAccessible(true);

        field2.set(animal1, (Integer) 2);

        typeOfAnimal = String.valueOf((Integer) field2.get(animal1));

        System.out.println("New value of typeOfAnimal will be: "+ typeOfAnimal + s3);

    }


}
