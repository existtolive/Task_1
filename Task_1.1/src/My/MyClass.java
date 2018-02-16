package My;
import java.util.Scanner;

/**
 *
 * Сложение дробных чисел, которые пользователь вводит в консоль.
 *
 * Задание 1.1
 *
 * @version 1.0.0
 *
 * @author existtolive
 *
 */

public class MyClass {

    public static void  main (String[] args){

        System.out.println("Калькулятор v1.0.0");
        System.out.println("Сложение дробных чисел");

        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число ( = для ответа ): ");

        //Суммируем до появления '=' используя класс Калькулятор
        String x;
        while(Calculator.summing){
            System.out.print("+ ");
            x = scanner.nextLine();

            if(x.equals("=")){
                //Вывод ответа при '='
                Calculator.summing = false;
                System.out.println("Ответ: ");
                System.out.printf("%.4f", Calculator.result);
            }
            else {
                try {
                    Calculator.sumNums(Double.parseDouble(x));
                }
                catch (NumberFormatException e) {
                    System.err.println("Некорректный ввод!");
                }
            }

        }
        scanner.close();
    }

    /**
     *
     * Калькулятор с функцией сложения дробных чисел
     *
     */
    public static class Calculator{
        public static boolean summing = true;
        public static double result = 0;

        public static void sumNums(double x) {
            result += x;
        }


    }


}
