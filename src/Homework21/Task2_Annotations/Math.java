package Homework21.Task2_Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Створити свою інструкцію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
//@Math(num1 = 100, num2 = 200)
//public void mathSum(int num1, int num2)

@Target(ElementType.METHOD)  // тип оголошення: анотація буде застосовуватись лише до методів
@Retention(RetentionPolicy.RUNTIME) // анотація буде записана в class-файл і доступна під час виконання через reflection

// Створюємо власну анотацію

public @interface Math {

    int num1();
    int num2();


}
