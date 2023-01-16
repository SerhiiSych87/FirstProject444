package Homework_12_13;

abstract class Animal {

    public abstract void groUp (); //група тварин
    public abstract void subGroup (); //підгрупа тварин
    public abstract void numb_of_described_Species (); //кількість описаних класів
    public abstract void clasSification (); //класифікація
    public abstract void tYpe (); //тип тварин
    public void biggest_Animal () { //метод опису найбільшої тварини
        String animal_b = "Синій кит - blue whale";
        System.out.println(animal_b+" "+" (Balaenoptera musculus)");
    }
    public void smallest_Animal (){ //метод опису найменшої тварини
        String animal_s = "parasitic animals - паразитичні тварини";
        System.out.println(animal_s+" "+ "(Myxobolus shekel)");

    }
}

class Fishes extends Animal { //підклас Риби успадковує БК

    public void inFo () {

        System.out.println("About Fishes ---");
    }

    @Override
    public void groUp() {

        System.out.println("Group is ");
        System.out.println("Vertebrates - Хребетні");
    }

    @Override
    public void subGroup() {

        System.out.println("Subgroup is ");
        System.out.println("Pisces - Риби");

    }

    @Override
    public void numb_of_described_Species() {

        System.out.println("Number of described species - Кількість описаних видів ");
        System.out.println("25 000");
    }

    @Override
    public void clasSification() {

        System.out.println("Classification is - Класифікація");
        System.out.println("Watery - Водні");
    }

    @Override
    public void tYpe() {

        System.out.println("Type is - Тип тварин");
        System.out.println("Сhordal - хордові тварини");


    }
}
class Arachnids extends Animal { //підклас Павукоподібні успадковує БК

    public void inFo () {

        System.out.println("About Arachnids ---");
    }

    @Override
    public void groUp() {

        System.out.println("Group is ");
        System.out.println("Invertebrates - ,Безхребетні");
    }

    @Override
    public void subGroup() {

        System.out.println("Subgroup is ");
        System.out.println("Arachnids - Павукоподібні");

    }

    @Override
    public void numb_of_described_Species() {

        System.out.println("Number of described species - Кількість описаних видів ");
        System.out.println("100 000");
    }

    @Override
    public void clasSification() {

        System.out.println("Classification is - Класифікація");
        System.out.println("Eukaryotes - Еукаріоти");
    }

    @Override
    public void tYpe() {

        System.out.println("Type is - Тип тварин");
        System.out.println("Arthropoda - Членистоногі");

    }
}

class Main{

    public static void main(String[] args) {

        Fishes newFish = new Fishes();
        Arachnids newArach = new Arachnids();

        newFish.inFo(); // виклик власного - не успадкованого метода
        newFish.groUp();// виклик перевизначених методів
        newFish.subGroup();
        newFish.numb_of_described_Species();
        newFish.tYpe();
        newFish.clasSification();
        newArach.inFo(); // виклик власного - не успадкованого метода
        newArach.groUp();
        newArach.subGroup();
        newArach.numb_of_described_Species();
        newArach.tYpe();
        newArach.clasSification();
        newFish.biggest_Animal(); // виклик методу з батьківського класу
        newArach.smallest_Animal(); //виклик методу з батьківського класу




    }
}




