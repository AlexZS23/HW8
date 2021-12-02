import java.util.Scanner;

public class Reverse {

//    3. Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд
//            без использования встроенных в String функций.)

    public void reverseArray(String toReverse){

        char[] stringChar = toReverse.toCharArray();
        int count = stringChar.length;

        while (count > 0){
            System.out.print(stringChar[count - 1]);
            count--;
        }
        System.out.println("");
    }

}
