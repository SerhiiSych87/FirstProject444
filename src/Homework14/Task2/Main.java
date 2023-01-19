package Homework14.Task2;

public class Main {

    public static void main(String[] args) {

        Vehicles car = Vehicles.Car;
        Vehicles moto = Vehicles.Moto;
        Vehicles boat = Vehicles.Boat;

        System.out.println("First vehicle is: "+car.toString());
        System.out.println("-------------------------------");
        System.out.println("Second vehicle is: "+moto.toString());
        System.out.println("-------------------------------");
        System.out.println("Third vehicle is: "+boat.toString());

    }
}
