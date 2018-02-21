import sweets.Present;

import java.util.Scanner;

/**
 * Основной алгоритм
 */
public class NewYearPresent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Создаем экземпляр класса подарок
        Present present = new Present();
        System.out.println("Начинается сборка подарка");

        //Основной алгоритм: запрашиваем действие - считываем - выполняем методы объекта подарок
        //Остановка при вводе "0"
        String s = "";
        do {
            System.out.println("Выберите следующее действие:");
            System.out.println("+ для добавления новых сладостей");
            System.out.println("- для удаления всех сладостей по типу");
            System.out.println("= для вывода текущего состава подарка");
            System.out.println("0 для завершения сборки и вывода конечной информации о подарке");
            s = scanner.next();
            if(s.equals("+")){
                present.addCandies();
            }
            else if(s.equals("-")){
                present.delCandies();
            }
            else if(s.equals("=")){
                present.getPresentInfo();
            }
            else if(s.equals("0")){
                present.getFinalPresentInfo();
                break;
            }
            else continue;
        }
        while(true);


    }
}
