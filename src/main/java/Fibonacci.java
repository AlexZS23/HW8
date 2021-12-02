public class Fibonacci {

//    4. Fibonacci (Рассчитать первых 50 чисел Фиббоначии вывести их на экран)

    public void fibonacci(int maxValue){

        long firstNumber = 1;
        long secondNumber = 1;
        long nextNumber;

        System.out.print(firstNumber + " " + secondNumber + " ");

        for(int i = 3; i <= maxValue; i++){
            nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        System.out.println();

//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711

    }

}
