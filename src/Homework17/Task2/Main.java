package Homework17.Task2;

import java.util.Arrays;
import java.util.Comparator;

    public class Main {
        public static void main(String[] args) {
            Car1 c1 = new Car1 (200, 6000, "Alfa Romeo", "Green");
            Car1 c2 = new Car1(160, 12000, "Volvo", "Grey");
            Car1 c3 = new Car1(180, 15000, "Jeep", "Red");
            Car1[] c = {c1, c2, c3};

            Arrays.sort(c, new Comparator<Car1>() {
                public int compare(Car1 o1, Car1 o2) {
                    return o1.speed - o2.speed;
                }
            });
            for (Car1 temp : c) {
                System.out.println(temp);
            }
            System.out.println();

            Arrays.sort(c, new Comparator<Car1>() {
                public int compare(Car1 o1, Car1 o2) {
                    return o1.price - o2.price;
                }
            });
            for (Car1 temp : c) {
                System.out.println(temp);
            }
            System.out.println();

            Arrays.sort(c, new Comparator<Car1>() {
                public int compare(Car1 o1, Car1 o2) {
                    return o1.model.compareTo(o2.model);
                }
            });
            for (Car1 temp : c) {
                System.out.println(temp);
            }
            System.out.println();

            Arrays.sort(c, new Comparator<Car1>() {
                public int compare(Car1 o1, Car1 o2) {
                    return o1.color.compareTo(o2.color);
                }
            });
            for (Car1 temp : c) {
                System.out.println(temp);
            }
        }
    }
