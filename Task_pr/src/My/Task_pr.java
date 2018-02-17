package My;
import java.util.Scanner;

/**
 *
 * 1) Решить следующее уравнение для различных  значений x и y: 3(x + 2x -y)/2x;
 *
 * 2) Дана строка «Я хороший разработчик автотестов».
 * • необходимо заменить слово « хороший» на любое другое, какое нравится.
 * • получить из полученной строки новую,содержащую значение «разработчик»
 *
 * @version 1.0.0
 *
 * @author existtolive
 *
 */

public class Task_pr {

    public static void  main (String[] args){
        System.out.println("1) Решить следующее уравнение для различных  значений x и y: 3(x + 2x -y)/2x");
        partOne();

        System.out.println("\n2) Дана строка «Я хороший разработчик автотестов» ");
        System.out.println("необходимо заменить слово « хороший» на любое другое, какое нравится.");
        System.out.println("получить из полученной строки новую,содержащую значение «разработчик»");
        partTwo();
    }

    public static void partOne(){
        System.out.print("Введите x");

        //Инициализация сканера
        Scanner scanner = new Scanner(System.in);
        int x,y;
        //Считываем пока не получим int
        while(true){
            System.out.print(": ");
            try {
                x = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e) {
                System.err.println("Некорректный ввод!");
            }
        }

        System.out.print("Введите y");

        //Считываем пока не получим int
        while(true){
            System.out.print(": ");
            try {
                y = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e) {
                System.err.println("Некорректный ввод!");
            }
        }

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("3(x + 2x -y)/2x = " + 3.0f*(x+2.0f*x-y)/(2.0f*x));

        scanner.close();
    }

    public static void partTwo(){
        String s = "Я хороший разработчик автотестов";
        System.out.println("\nБыло: «"+s+"» ");
        s = s.replace("хороший", "высококачественный");
        System.out.println("После замены: «"+s+"» ");
        s=s.substring(s.indexOf("разработчик"), s.indexOf("разработчик")+"разработчик".length());
        System.out.println("После чистки: «"+s+"» ");
    }

}
