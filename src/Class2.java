import java.util.Scanner;

public class Class2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Введіть першу сторону трикутника");
        float a  = input.nextFloat();
        System.out.println("Введіть другу сторону трикутника");
        float b  = input.nextFloat();
        System.out.println("Введіть третю сторону трикутника");
        float c  = input.nextFloat();
        float p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площа трикутника за формулою Герона");
        System.out.println(S);
    }

}
