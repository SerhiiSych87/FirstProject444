package Homework_18_19.Task2;

//Мінімальне з N чисел (використовувати LinkedList):
//1. Введіть із клавіатури число N.
//2. Зчитати N цілих чисел і заповнити ними список - метод getIntegerList.
//3. Знайти мінімальне число серед елементів списку – метод getMinimum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Minimum {

     // метод зчитування цілих чисел і заповнення ними списку
      public static List <Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // зчитування даних з системного вхідного потоку (з клавіатури)
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = Integer.parseInt(reader.readLine());  //введення к-ті цілих чисел
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));  //вносимо введені числа до списку
        }
         return list;
    }

    // метод знаходження мінімального елемента масиву
    public static int getMinimum (List<Integer>array_of_num) {
        int min = array_of_num.get(0);   //по замовчуванню мінімальний елемент з 0-им індексом
        for (int i = 0; i < array_of_num.size(); i++) {

            if (array_of_num.get(i) <= min) //первірка умови
                min = array_of_num.get(i);
        }
    return min;
}

    public static void main(String[] args) throws IOException {

        List<Integer> integerList = getIntegerList();

        System.out.println("Minimum of these " + integerList.size()+" numbers is number - "+getMinimum(integerList));

    }
}