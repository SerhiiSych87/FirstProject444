package Homework20.Task2;

//Створіть файл, запишіть у нього довільні дані та закрийте файл.
// Потім знову відкрийте цей файл, прочитайте дані і виведіть їх

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileWriteRead {

    public static void main(String[] args) throws Exception {

        File file1 = new File("C:\\Users\\Serega\\IdeaProjects\\FirstProject\\src\\Homework20\\Task2\\Test3");

        // запис тексту в файл
        PrintWriter pwr = new PrintWriter(file1);

        pwr.println("Represents a currency; Currencies are identified by their ISO 4217 currency codes; Visit the ISO web site for more information, including a table of currency codes.");
        pwr.flush();
        pwr.close();

        // зчитування
        FileReader frd = new FileReader(file1);
        BufferedReader bfrd = new BufferedReader(frd);

        // зчитуємо строки та додаємо в масив, та сплітуємо по regex
        String start = bfrd.readLine();
        String [] words = start.split(";");
        System.out.println(Arrays.toString(words)); // виводимо масив до консолі

        bfrd.close();
    }

}
