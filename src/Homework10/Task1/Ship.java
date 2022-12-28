package Homework10.Task1;

public class Ship extends Vehicle {

    public int number_of_passengers_ship;

    public String port_of_registration;

    public Ship(int price, int speed, int year, int number_of_passengers_ship, String port_of_registration) {
        super(price, speed, year);
        this.number_of_passengers_ship = number_of_passengers_ship;
        this.port_of_registration = port_of_registration;
    }
}
