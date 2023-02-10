package Homework_18_19.Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Використовуючи колекцію, підвійте слово:
//        1. Введіть із клавіатури 5 слів до списку рядків.
//        2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
//        3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.


public class Doublewords1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in)); // зчитування потоку
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please enter 5 words");
        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        ArrayList<String> list_double = doubleValues(list);

        for (String s : list_double)  // foreach для виведення результату нового подвоєного списку
            System.out.println(s);
    }

    // метод подвоєння слів
    public static ArrayList<String> doubleValues (ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i)); // додаємо до кожного елемента списку ідентичний за індексом start з 0
            i++;

        } return list;
    }
}



