import java.util.Scanner;

public class ProgramCases {

    public void programCases() {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите Ваш логин");
        String login = s.nextLine();
        System.out.println("Введите Ваш пароль");
        String password = s.nextLine();

        boolean loginCorrect;

        if (!login.equals("alex") || !password.equals("123")) {
            System.out.println("Данные некорректны. Повторите, пожалуйста, ввод.");
        } else {
            loginCorrect = true;

            while (loginCorrect) {
                System.out.println("Введите порядковый номер задачи");
                System.out.println("1. Even Number");
                System.out.println("2. Armstrong");
                System.out.println("3. Reverse");
                System.out.println("4. Fibonacci");
                System.out.println("5. Replace");
                System.out.println("6. Выйти из программы");

                int programNumber = s.nextInt();

                switch (programNumber) {
                    case 1:
                        Scanner s1 = new Scanner(System.in);
                        System.out.println("Введите целое число");
                        String inputValue = s1.nextLine();
                        EvenNumber evenNumber = new EvenNumber();
                        evenNumber.checkEbenOdd(inputValue);
                        break;

                    case 2:
                        Armstrong armstrong = new Armstrong();
                        Scanner s2 = new Scanner(System.in);
                        System.out.println("Введите целое число");
                        int inputArmstrongNumber = s2.nextInt();
                        armstrong.isArmstrong(inputArmstrongNumber);
                        break;

                    case 3:
                        Reverse reverse = new Reverse();
                        Scanner s3 = new Scanner(System.in);
                        System.out.println("Введите строку для преобразования");
                        String stringToReverse = s3.nextLine();
                        reverse.reverseArray(stringToReverse);
                        break;

                    case 4:
                        Fibonacci fibonacci = new Fibonacci();
                        fibonacci.fibonacci(50);
                        break;

                    case 5:

                        Replace replace = new Replace();
                        Scanner s5 = new Scanner(System.in);
                        System.out.println("Введите строку для замены символов. Строка должна содержать до 30 символов.");
                        String stringToReplace = s5.nextLine();
                        replace.replaceString(stringToReplace);
                        break;

                    case 6:
                        loginCorrect = false;
                        System.out.println("Вы успешно вышли из программы.");
                        break;

                    default:
                        System.out.println("Номер не соответствует указанному в списке");
                        break;

                }
            }
        }
    }
}
