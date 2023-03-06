package Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter1 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Serega\\Desktop\\Test11.txt");

        PrintWriter pw = new PrintWriter(file);

        pw.println("Good");
        pw.println("Day");
        pw.println("Day1");
        pw.flush();
        pw.close();


    }


}
