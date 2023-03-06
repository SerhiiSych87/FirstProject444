package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Використовуючи колекцію, підвійте слово:
//        1. Введіть із клавіатури 5 слів до списку рядків.
//        2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
//        3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.


public class Doublewords {

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
                int a = 0;
                int b = 0;
                for (int i = 0; i < 5; i++) {
                    list.add(a, list.get(b)); // додаємо до кожного елемента списку ідентичний за індексом start з 0
                    a +=2;
                    b +=2;

                } return list;
            }
        }





        
