import javafx.scene.transform.Scale;

import java.util.Scanner;

public class EvenNumber {

//    1. Even Number (Напишите программу которая определяет, является ли число четным или нет.
//            Проверять только целые числа. Добавить обработку ошибок с описанием.)


    public void checkEbenOdd(String someString){

        if (someString.matches("[0-9]+")) {

            int myNumber = Integer.parseInt(someString);

            if (myNumber % 2 == 0) {
                System.out.println("Ваше число четное");
                System.out.println("- - - - - - - - - ");
            } else {
                System.out.println("Ваше число нечетное");
                System.out.println("- - - - - - - - - - ");
            }
        } else {
            System.out.println("Указанное значение не является целым числом");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
        }

    }
}
