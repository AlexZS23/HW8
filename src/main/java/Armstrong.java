public class Armstrong {

//    2. Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга.
//    Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень,
//                  равную количеству цифр в этом числе. Как пример - число 371:
//            371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//            Если у вас число четырехзначное:
//            8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208)


    public void isArmstrong(int numberForCheck) {

        int temp;
        int extend = 0;
        int lastNumber = 0;
        int sum = 0;

        temp = numberForCheck;

// Нахожу степень, используя остаток от деления
        while (temp > 0) {
            temp = temp / 10;
            extend++;
        }
// По тому же принципу определяем цифры и берем их в степень, которая указана выше
        temp = numberForCheck;
        while (temp > 0) {
            lastNumber = temp % 10;
            sum = (int) (sum + (Math.pow(lastNumber, extend))); //преобразовал double в int
            temp = temp / 10;
        }

        if (numberForCheck == sum) {
            System.out.println("Указанное число является числом Армстронга");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
        } else {
            System.out.println("Указанное число не является числом Армстронга");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
        }

    }

}


