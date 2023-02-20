package Homework21.Task3_Reflection;

//** Створіть 2 класи,  та . У класі  ініціалізуйте 3 поля різних модифікаторів.
// У класі Cat використовуючи reflection, отримайте доступ до полів класу та змініть вміст кожного з полів.

public class Animals {

    private String name = "Animal";

    public String kindOfAnimal = "Etymology";

    protected int typeOfAnimal = 1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Animals() {
//        this.name = name;
//        this.kindOfAnimal = kindOfAnimal;
//        this.typeOfAnimal = typeOfAnimal;
//    }
}
