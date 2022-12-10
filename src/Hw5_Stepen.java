import java.util.Scanner;
public class Hw5_Stepen {

    static int myMethod(int number, int degree) {

        Scanner input = new Scanner(System.in);
        int result = 1;
        for (int i = 1; i <= degree; i++)
            result = result * number;
            return result;
}
    public static void main(String[] args) {
        System.out.println(myMethod(3,2)+myMethod(2,6));

    }

}

