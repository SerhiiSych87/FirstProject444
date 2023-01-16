package Lesson10;

public class Main {



    public static void main(String[] args) {

        LiteCars car1 = new LiteCars("Volvo", 5000, 2008, "V8", "Sedan");

        System.out.println(car1.getModel()+" "+car1.getPrice()+" "+car1.getYear()+" "+car1.engine+" "+car1.type_of_car);


    }



}
