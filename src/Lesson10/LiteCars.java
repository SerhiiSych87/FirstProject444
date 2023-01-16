package Lesson10;

public class LiteCars extends Cars {

    public String engine;
    public String type_of_car;


    public LiteCars(String model, int price, int year, String engine, String type_of_car) {
        super(model, price, year);
        this.engine = engine;
        this.type_of_car = type_of_car;
    }
}
