package Homework21.Task1;

//Напишіть програму, яка виводитиме всю інформацію про клас

public class HeadClass {

    private String name;

    private int number;

    public int count;

    public HeadClass(String name, int number, int count) {
        this.name = name;
        this.number = number;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static class Subordinate extends HeadClass {

        private String name1;

        private int number1;

        private static final String OurGroup = "Our group in ITEA is the best";

        public Subordinate(String name, int number, int count) {
            super(name, number, count);
        }


        private static void Info_about (){

            System.out.println("Java is very good");
        }


    }
}