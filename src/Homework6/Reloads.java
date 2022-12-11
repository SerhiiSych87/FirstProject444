package Homework6;

public class Reloads {
    // Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
    // створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
    static int myAverage (int a, int b, int c) {

        return (a + b + c)/3;

    }

    static int myAverage (int a, int b, int c, int d) {

        return (a + b + c + d)/4;

    }

    static int myAverage (int a, int b, int c, int d, int e) {

        return (a + b + c + d + e)/5;

    }

    public static void main(String[] args) {

        int myAverage1 = myAverage(1, 2,3);
        int myAverage2 = myAverage(2,3,3,4 );
        int myAverage3 = myAverage(6,2,3,4, 5);
        int max=0;
        int min=0;
        int ser=0;
        if (myAverage1>myAverage2&&myAverage1>myAverage3) max=myAverage1;
        if (myAverage2>myAverage1&&myAverage2>myAverage3) max=myAverage2;
        if (myAverage3>myAverage2&&myAverage3>myAverage1) max=myAverage3;
        if (myAverage1<myAverage2&&myAverage1<myAverage3) min=myAverage1;
        if (myAverage2<myAverage1&&myAverage2<myAverage3) min=myAverage2;
        if (myAverage3<myAverage1&&myAverage3<myAverage2) min=myAverage3;
        if (myAverage1>myAverage2&&myAverage1<myAverage3 || myAverage1<myAverage2&&myAverage1>myAverage3) ser=myAverage1;
        if (myAverage2>myAverage1&&myAverage2<myAverage3 || myAverage2<myAverage1&&myAverage2>myAverage3) ser=myAverage2;
        if (myAverage3>myAverage1&&myAverage3<myAverage2 || myAverage3<myAverage1&&myAverage3>myAverage2) ser=myAverage3;
        System.out.println("max = "+ max);
        System.out.println("min = "+min);
        System.out.println("seredne = "+ser);

    }
}
