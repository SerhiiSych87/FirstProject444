package Homework9.Task3;

class Computers {
    static CPC[] namepc = new CPC [5]; // створюємо масив обєктів з 5 елементів

    public static void main (String[] args){
        namepc[0] = new CPC("PC1"); // заповнюэмо наш масив
        namepc[1] = new CPC("PC2");
        namepc[2] = new CPC("PC3");
        namepc[3] = new CPC("PC4");
        namepc[4] = new CPC("PC5");

        for (int i = 0; i<5; i++){ // створюємо цикл для виводу кожного елемента масива
            System.out.println(namepc[i].name);
        }
    }
}

class CPC{  // створюємо клас для масива
    String name;

    public CPC (String name){
        this.name = name;
    }
}

