package Test;

import java.util.Scanner;
public class LeapYearClass {
    public static void main(String[] args) {
        Scanner Year = new Scanner(System.in);
        System.out.println("Enter year");
        int a = Year.nextInt();
        if ((a%4==0)&&(a%100!=0 || a%400==0))
            System.out.println("This year is leap");
        else
            System.out.println("This year is not leap");
    }





}
