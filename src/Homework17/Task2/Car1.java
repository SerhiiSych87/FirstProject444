package Homework17.Task2;

    public class Car1{
        int speed;
        int price;
        String model;
        String color;

        Car1(int speed, int price, String model, String color) {
            this.speed = speed;
            this.price = price;
            this.model = model;
            this.color = color;
        }

        public String toString() {
            return this.model + " " + this.color + " " + this.speed + " " + this.price;
        }
    }

