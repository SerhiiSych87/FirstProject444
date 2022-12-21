package Homework9;

import java.sql.SQLOutput;

public class Book {

    private String bookName;

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String newName) {

        this.bookName = newName;

    }

    public void show() {

        System.out.println(bookName);

    }

    public static void main(String[] args) {

        Book book1 = new Book ();
        book1.setBookName("JAVA 2022");

        Title name1 = new Title();
        name1.setName("language novelties 2022");

        Author name2 = new Author();
        name2.setName1("Dmitro Krasnui");

        Content content1 = new Content();
        content1.setTypeof("scientific literature");

        book1.show();
        name1.show();
        name2.show();
        content1.show();

    }
}
