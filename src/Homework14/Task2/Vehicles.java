package Homework14.Task2;

public enum Vehicles {

    Car(5000){
        @Override
        public String getColor() {
            return "White";}
        },Moto(4000) {
        String color = "White";
        @Override
        public String getColor() {
            return "Black";
        }
    },Boat(10000){

        String color = "Red";

        public String getColor() {
            return "Red";}
    };

    Vehicles(int price){ //конструктор

        this.price = price;

    }

    int price;
    String color;
    public String getColor(){ // метод, що повертає колір

        return color;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Price = "+price+", "+"Color - "+getColor();
    }
}
