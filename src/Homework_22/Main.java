package Homework_22;

import java.io.*;

// Зробити сереалізацію десереалізацію будь якого обїєкта, двома варіантами, котрі були розглянуті на уроці. Через інтерфейс Serializable та за допомогою методів

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        File f = new File ("C:\\Users\\Serega\\IdeaProjects\\FirstProject\\src\\Homework_22\\Text_for_ser_unser.txt");

        CompanyClass Comp = new CompanyClass(500000, "Ivanov", new Department("Petrov"));

        ObjectOutputStream oost = new ObjectOutputStream(new FileOutputStream(f));

        // Серіалізуємо об'єкт у байт-код

        oost.writeObject(Comp);
        oost.flush();
        oost.close();


        // Десеріалізуємо об'єкт у байт-код

        ObjectInputStream oist = new ObjectInputStream(new FileInputStream(f));

        CompanyClass Company1 = (CompanyClass) oist.readObject();

        oist.close();

        System.out.println("After unserialize we get:  ");

        System.out.println(Company1.getChief() + " " + Company1.getValue() + " " + Company1.department.employee);

    }

}
