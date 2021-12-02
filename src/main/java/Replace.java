import java.util.Scanner;

public class Replace {
    //
////    5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
////            Выводит новую строку на экран.
////            Добавить обработку длины строки, максимальная длина 30 символов.
////            Строка может состоять из нескольких слов и любых символов)
//
    public void replaceString(String stringReplace) {

        String temp;
        String result;

        if (stringReplace.length() > 30) {
            System.out.println("Некорректная длина строки. Максимальная - 30 символов.");
            System.out.println("- - - - - - - - - - - - - -");
        } else {
            temp = stringReplace.replace('а', '@');
            result = temp.replace('о', '0');
            System.out.println(result);
            System.out.println("- - - - - - - - -");
        }


    }
}












