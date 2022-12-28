package Homework10.Task1;

public class Plane extends Vehicle {

    public int height;

    public int number_of_passengers;

    public Plane(int price, int speed, int year, int height, int number_of_passengers) {
        super(price, speed, year);
        this.height = height;
        this.number_of_passengers = number_of_passengers;
    }
}


