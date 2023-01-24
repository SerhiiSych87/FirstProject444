package Homework15.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayClass {
    public static void main(String[] args) {

        ArrayList<Integer> newint = new ArrayList<>();
        newint.add(10);
        newint.add(20);
        newint.add(30);
        newint.add(40);
        newint.add(50);
        System.out.println(newint);

        // outputting array objects with a loop
        for (int i = 0; i < newint.size(); i++) {
            System.out.println(newint.get(i));
        }
     int x = newint.get(1)*newint.get(4);
        newint.add(1,x);
        System.out.println("After adding we get:");
        System.out.println(newint);
        Collections.sort(newint);
        System.out.println("After sorting we get: ");
        System.out.println(newint);

    }

}
