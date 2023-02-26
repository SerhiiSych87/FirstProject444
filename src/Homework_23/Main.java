package Homework_23;

//Знайти API курсу валют будь якого банку та розпарсити (витягти) інформацію стосовно усіх значень в API та записати до JSON файлу в пакеті

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

    //метод приймає строку JSON і перетворює ії в объект JavaScript

    JacksonPars.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");

    }
}
