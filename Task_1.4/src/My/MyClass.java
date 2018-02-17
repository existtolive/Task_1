package My;
import java.util.Scanner;

/**
 *
 * Поиск максимального элемента в массиве
 *
 * Задание 1.4
 *
 * @version 1.0.0
 *
 * @author existtolive
 *
 */

public class MyClass {

    public static void  main (String[] args) {

        System.out.println("Поиск максимального элемента в массиве");
        System.out.println("Введите размер массива: ");

        //Ввод данных, проверка на корректность в цикле до ввода правильного значения
        Scanner scanner = new Scanner(System.in);
        String x;
        int masLength;
        while(true){
            System.out.print(": ");
            x = scanner.nextLine();
            try {
                masLength = Integer.parseInt(x);
                break;
            }
            catch (NumberFormatException e) {
                System.err.println("Некорректный ввод!");
            }
        }

        //Заполнение массива + одновременное сохранение слова с макс длиной
        System.out.println("\nЗаполнение массива:");
        String[] strList = new String[masLength];
        String maxLengthWord = "";
        for (int i = 0; i < strList.length; i++)
        {
            System.out.print("Введите элемент для добавления в массив: ");
            x = scanner.nextLine();
            strList[i] = x;
            if( x.length() >= maxLengthWord.length() )
                maxLengthWord = x;
        }

        System.out.println("\nПоиск максимального элемента...");
        System.out.println("Слово, имеющее максимальную длину в массиве: " + maxLengthWord);

        scanner.close();


    }
}
