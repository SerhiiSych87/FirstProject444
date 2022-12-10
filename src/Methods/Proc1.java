package Methods;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Proc1 {
    static int myPower(int A) {
        int B = (int) Math.pow(A,3);
        return B;
    }

    public static void main(String[] args) {
         System.out.println(myPower(1));
         System.out.println(myPower(2));
         System.out.println(myPower(3));
         System.out.println(myPower(4));
         System.out.println(myPower(5));
    }
}

