package Homework_22.Meth2;

import java.io.*;

public class Main1 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Serega\\IdeaProjects\\FirstProject\\src\\Homework_22\\Meth2\\Test_serializ.txt");

        Company companyOur = new Company(1000, 500, "Popov", new Employee(25, "Alex"));

        // За рахунок імплементації від Closeable поміщаємо вихідний потік в Try with recources із вбудованим методом
        // close() - щоб прибрати цей метод в тілі коду. Аналогічно і для десеріалізації

        try (ObjectOutputStream oist = new ObjectOutputStream(new FileOutputStream(f))) {

            oist.writeObject(companyOur);

            oist.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
          throw new RuntimeException(e);

        }
        // Десеріалізуємо обєкт

        try (ObjectInputStream oit = new ObjectInputStream(new FileInputStream(f))) {

            Company Comp2 = (Company) oit.readObject();

            System.out.println(Comp2.owner + " " + Comp2.headCount + " "+ Comp2.empl.name + " " + Comp2.empl.age + " " + Comp2.state);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    }
