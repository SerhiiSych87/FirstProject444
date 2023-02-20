package Homework21.Task2_Annotations;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Створити свою інструкцію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
//@Math(num1 = 100, num2 = 200)
//public void mathSum(int num1, int num2)

public class SummClass {

    // Використаємо рефлексію

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //шаблон, який використовується для створення об’єктів і визначення типів і методів даних об’єктів

        Class <?> sum = Addition.class;

        //повертаємо новий екземпляр обєкта метод по нашому посиланню
        Method methSum1 = sum.getMethod("mathSum", int.class, int.class);

        // перевіряємо умову якщо наш метод містить анотацію (тоді = true)
        if(methSum1.isAnnotationPresent(Math.class)){

            Math summer = methSum1.getAnnotation(Math.class);
            //повертає анотацію об’єктів Method для вказаного типу, передану як параметр, якщо така анотація присутня, інакше null


            methSum1.invoke (null, summer.num1(), summer.num2()); // використовуємо метод для передачі змінної кількості параметрів методу
        }

    }
}
