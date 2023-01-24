package Homework15.Task2;

public class NewMain {

    public static void main(String[] args) {

        try {

            int[] chisla = {1, 2, 3, 4};
            System.out.println(chisla[6]);

        } catch (Exception e) {
            System.err.println("Unable to display non-existent index");
        }finally {

            System.out.println("The end of first code");
        }

        try{ int a,b,c;

            b=2;
            c=0;
            a=b/c;
            System.out.println(a);

        } catch (Exception e) {
            System.err.println("Impossible to divide by zero");
        }finally {

            System.out.println("The end of second code");
        }

    }
}