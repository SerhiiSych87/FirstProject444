package Homework8;

public class Army { // створення нового класу

    String country_of_army; // опис полів класу
    int army_size;
    int count_divisions = 10;

    public Army(String country_of_army) { // конструктор №1
        this.country_of_army = "Great Britain";
    }

    public Army(int army_size) { // конструктор №2
        this.army_size = 100000;
    }

    static void myMethod(){ // задання методу класу

        System.out.println("Ukraine army is the best ");
    }

    public static void main(String[] args) {

        Army division1 = new Army ("Ukraine"); // ініціалізація обєкту
        division1.country_of_army = "Ukraine";  // параметризація огбєкта
        Army division2 = new Army ("USA");
        Army division3 = new Army (250000);
        division3.army_size = 300000;
        Army division4 = new Army(15);
        division4.count_divisions = 15;


        System.out.println(division1.country_of_army); // виведення в консоль
        System.out.println(division2.country_of_army);
        System.out.println(division3.army_size);
        System.out.println(division4.count_divisions);

        myMethod();
    }

}
