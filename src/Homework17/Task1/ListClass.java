package Homework17.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Wolf");
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Giraffe");
        animals.add("Hippo");
        animals.add("Fox");
        animals.add("Hare");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Deer");

        Iterator<String> iter1 = animals.iterator(); // використання ітератора для перебора списку
        while (iter1.hasNext()) {                    //  доки ітератор містить наступний елемент
            System.out.println(iter1.next());       //   повернення наступного елемента в ітерації
        }

    }
}