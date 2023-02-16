//Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
// Виведіть на екран вміст файлу.

package Homework20;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Serega\\IdeaProjects\\FirstProject\\src\\Homework20\\Test2");

        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello. I am Serhii. I like to learn Java Pro");
        pw.println("Thank you");
        pw.flush();
        pw.close();

        // зчитуємо сканером

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){ // перевірка умови чи є наступний елемент

            System.out.println(sc.nextLine()); // вивід до консолі

        }

        }

    }


