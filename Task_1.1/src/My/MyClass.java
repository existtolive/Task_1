package My;
import java.util.Scanner;

/**
 * Задание 1.1
 *
 * @version 1.0.0
 *
 * @author existtolive
 *
 */

public class MyClass {

    public static void  main (String[] args){
        calculator();
    }

    /**
     * Сложение дробных чисел, которые пользователь вводит в консоль.
     */
    public static void calculator(){
        System.out.println("Calculator v1.0.0");

        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        //Вывод
        double result = a + b;
        System.out.print("Result = ");
        System.out.printf("%.4f", result);

        //Закрываем сканнер
        scanner.close();
    }
}
