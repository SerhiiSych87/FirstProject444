package Homework_18_19.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lines {

//Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
//1. Створити перелік рядків.
//2. Ввести рядки з клавіатури та додати їх до списку.
//3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
//4. Вивести рядки на екран, кожен з нового рядка.

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true){ //  повтор циклу доки вираз дійсний умові поки не відповідає "end"
            System.out.println("Enter your word: ");
            String a = reader.readLine();
            if(a.equals("end")){
                break;
            }
            else {
                list.add(a);  //  додаємо елементи до списку
            }
        }

        for (int i = 0; i < list.size(); i++) {  //  цикл forech для виводу кожного елемента
            System.out.println(list.get(i));
            
        }

    }
}
