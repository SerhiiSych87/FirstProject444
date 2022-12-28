package Homework10.Task1;

public class Main {

    public static void main(String[] args) {

        Plane plane1 = new Plane (250000000, 1000, 2017, 1500, 180);
        Ship ship1 = new Ship (13000000, 250, 2009,500,"Marseille");
        Car car1 = new Car(5000, 200, 2008);

        System.out.println("Plane"+" "+ "price is "+plane1.getPrice()+" "+" Speed is "+ " "+plane1.getSpeed()+" "+"Year is "+plane1.getYear()+" "+"Height is "+plane1.height+" "+ "Number of passengers is "+ plane1.number_of_passengers);
        System.out.println("Ship"+" "+ "price is "+ ship1.getPrice()+" "+ "Speed is " + ship1.getSpeed()+" " + "Year is " + ship1.getYear()+ " "+"Number of passengers is"+ ship1.number_of_passengers_ship+" "+ " Port is"+ " " + ship1.port_of_registration);
        System.out.println("Car"+" "+ "Price is "+car1.getPrice()+" "+ "Speed is "+ " "+ car1.getSpeed()+" "+ "Year is "+ car1.getYear());

    }

}
