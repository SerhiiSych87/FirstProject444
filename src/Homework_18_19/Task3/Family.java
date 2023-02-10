package Homework_18_19.Task3;

// Програма визначає, яка сім'я (прізвище) живе у місті:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Family {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> townsAndSurnames = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть чотири пари міст та родин: 1-ша строка - місто, 2-га прізвище родини");
        for (int i = 0; i < 4; i++) {
            int a=i+1;
            System.out.println("Пара №"+ a);
            townsAndSurnames.put(reader.readLine(), reader.readLine()); // додаємо введені пари ключів та значень
        }

        System.out.println("Введіть ключ - місто в якому живе родина");
        String a = reader.readLine();
        System.out.println("В цьому місті живуть "+ townsAndSurnames.get(a)); // отримання значення по введеному ключу

    }

}


