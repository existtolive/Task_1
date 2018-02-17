package My;
import java.util.Scanner;

/**
 *
 * Калькулятор с базовыми функциями для дробных чисел + поиск слова с максимальной длиной
 *
 * Задание 1.5
 *
 * @version 1.0.4
 *
 * @author existtolive
 *
 */

public class MyClass {

    /**
     * Вход в программу
     *
     * @param mode - хранит выбор между калькулятором и поиском самого длинного слова
     */
    public static void  main (String[] args){
        System.out.println("Выберите: ");
        System.out.println("1 для запуска калькулятора");
        System.out.println("2 для поиск максимального слова в массиве");

        //Инициализация сканера
        Scanner scanner = new Scanner(System.in);
        String mode;
        //Считываем пока не получим 1 или 2
        do {
            mode = scanner.nextLine();
            switch (mode) {
                case "1":   {
                    //Запуск калкьулятора
                    Calculator.init();
                    break;
                }
                case "2":   {
                    //Запуск метода по поиску самого длинного слова
                    maxLengthWord();
                    break;
                }
                default:    System.err.println("Выберите правильный режим!");
                    break;
            }
        }
        while(!mode.equals("1")&&!mode.equals("2"));

    }

    /**
     * Поиск максимального элемента в массиве
     *
     * @param masLength - длина массива
     * @param maxLengthWord - последнее самое длинное слово
     */
    public static void maxLengthWord(){
        System.out.println("Поиск максимального элемента в массиве");
        System.out.println("Введите размер массива: ");

        //Инициализация сканера
        Scanner scanner = new Scanner(System.in);
        int masLength;
        //Считываем значение размера массива, до тех пор пока не получим значение типа int
        while(true){
            System.out.print(": ");
            try {
                masLength = Integer.valueOf(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e) {
                System.err.println("Некорректный ввод!");
            }
        }

        //Заполнение массива + сохранение слова с макс длиной
        System.out.println("\nЗаполнение массива:");
        String[] strList = new String[masLength];
        String maxLengthWord = "";
        for (int i = 0; i < strList.length; i++)
        {
            System.out.print("Введите элемент для добавления в массив: ");
            strList[i] = scanner.nextLine();
            if( strList[i].length() >= maxLengthWord.length() )
                maxLengthWord = strList[i];
        }

        System.out.println("Слово, имеющее максимальную длину в массиве: " + maxLengthWord);

        scanner.close();
    }

    /**
     *
     * Класс калькулятора с базовыми функциями для дробных чисел
     *
     * @param mode - режим работы калькулятора:
     *  init - начальное
     *  + сложение, - вычитание, * умножение, / деление, res - вывод ответа
     * @param result - хранит накопленный результат
     * @param x - хранит последнее введенное число
     */
    public static class Calculator{
        public static String mode = "init";
        public static double result = 0;

        public static void init(){
            System.out.println("Калькулятор v1.0.2");
            System.out.println("Сложение и умножение дробных чисел");

            //Выбор режима: сложение/вычитание/умножение/деление
            System.out.println("Выберите режим: ");
            System.out.println("+ для сложения");
            System.out.println("- для вычитания");
            System.out.println("* для умножения");
            System.out.println("/ для деления");

            Scanner scanner = new Scanner(System.in);
            do{
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

            //Ввод данных
            System.out.println("Введите дробное число ( = для ответа ): ");

            //Считываем до появления '='
            String x;
            while(!mode.equals("res")){
                System.out.print(mode + " ");
                x = scanner.nextLine();

                //Вывод ответа при '='
                if(x.equals("=")) {
                    mode = "res";
                    System.out.println("Ответ: ");
                    System.out.printf("%.4f", Calculator.result);
                }
                //Иначе выполняем действие в зависимости от выбранного режима
                else
                    try {
                        switch (mode) {
                            case "+":   sumNums(Double.parseDouble(x));
                                        break;
                            case "-":   subNums(Double.parseDouble(x));
                                        break;
                            case "*":   multiplyNums(Double.parseDouble(x));
                                        break;
                            case "/":   divideNums(Double.parseDouble(x));
                                        break;
                        }

                    }
                    catch (NumberFormatException e) {
                        System.err.println("Некорректный ввод!");
                    }
            }
            scanner.close();
        }

        //Суммирование
        public static void sumNums(double x) {
            result += x;
        }

        //Вычитание
        public static void subNums(double x) {
            if(result==0) result = x;
            else result -= x;
        }

        //Умножение
        public static void multiplyNums(double x) {
            if(result==0) result = 1;
            result *= x;
        }

        //Деление
        public static void divideNums(double x) {
            if(result==0) result = x;
            result /= x;
        }
    }


}
