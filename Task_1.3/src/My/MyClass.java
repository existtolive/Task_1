package My;
import java.util.Scanner;

/**
 *
 * Сложение дробных чисел, которые пользователь вводит в консоль.
 *
 * Задание 1.3
 *
 * @version 1.0.2
 *
 * @author existtolive
 *
 */

public class MyClass {

    public static void  main (String[] args){

        System.out.println("Калькулятор v1.0.2");
        System.out.println("Сложение и умножение дробных чисел");

        //Выбор режима: сложение/вычитание/умножение/деление
        System.out.println("Выберите режим: ");
        System.out.println("+ для сложения");
        System.out.println("- для вычитания");
        System.out.println("* для умножения");
        System.out.println("/ для деления");

        Scanner scanner = new Scanner(System.in);
        String mode;
        do {
            mode = scanner.nextLine();
            switch (mode) {
                case "+":   System.out.println("Выбран режим сложения");
                    break;
                case "-":   System.out.println("Выбран режим вычитания");
                    break;
                case "*":   System.out.println("Выбран режим умножения");
                    break;
                case "/":   System.out.println("Выбран режим деления");
                    break;
                default:    System.err.println("Выберите правильный режим!");
                    break;
            }

        }
        while(!mode.equals("+")&&!mode.equals("-")&&!mode.equals("*")&&!mode.equals("/"));

        scanner.reset();

        //Ввод данных
        System.out.println("Введите дробное число ( = для ответа ): ");
        scanner = new Scanner(System.in);

        //Выполняем до появления '=' используя класс Калькулятор
        String x;
        while(Calculator.mode!=0){
            System.out.print(mode + " ");
            x = scanner.nextLine();

            switch (mode) {
                case "+":   {
                    if(x.equals("=")) {
                        //Вывод ответа при '='
                        Calculator.mode = 0;
                        System.out.println("Ответ: ");
                        System.out.printf("%.4f", Calculator.result);
                    }
                    else
                        try {
                            Calculator.sumNums(Double.parseDouble(x));
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Некорректный ввод!");
                        }
                    break;
                }

                case "-":   {
                    if(x.equals("=")) {
                        //Вывод ответа при '='
                        Calculator.mode = 0;
                        System.out.println("Ответ: ");
                        System.out.printf("%.4f", Calculator.result);
                    }
                    else
                        try {
                            Calculator.subNums(Double.parseDouble(x));
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Некорректный ввод!");
                        }
                    break;
                }

                case "*":   {
                    if(x.equals("=")) {
                        //Вывод ответа при '='
                        Calculator.mode = 0;
                        System.out.println("Ответ: ");
                        System.out.printf("%.4f", Calculator.result);
                    }
                    else
                        try {
                            Calculator.multiplyNums(Double.parseDouble(x));
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Некорректный ввод!");
                        }
                    break;
                }

                case "/":   {
                    if(x.equals("=")) {
                        //Вывод ответа при '='
                        Calculator.mode = 0;
                        System.out.println("Ответ: ");
                        System.out.printf("%.4f", Calculator.result);
                    }
                    else
                        try {
                            Calculator.divideNums(Double.parseDouble(x));
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Некорректный ввод!");
                        }
                    break;
                }
            }


        }
        scanner.close();
    }

    /**
     *
     * Калькулятор с базовыми функциями для дробных чисел
     *
     */
    public static class Calculator{
        public static byte mode = -1;
        public static double result = 0;

        public static void sumNums(double x) {
            result += x;
        }

        public static void subNums(double x) {
            if(result==0) result = x;
            else result -= x;
        }

        public static void multiplyNums(double x) {
            if(result==0) result = 1;
            result *= x;
        }

        public static void divideNums(double x) {
            if(result==0) result = x;
            result /= x;
        }
    }


}
