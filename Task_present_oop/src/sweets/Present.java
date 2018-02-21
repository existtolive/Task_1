package sweets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Класс подарка
 *  @param present - хранит список объектов типа  CandyGod(сладость)
 */
public class Present {
    ArrayList<CandyGod> present = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    /**
     * Функция считывает данные из консоли и добавляет в коллекцию present некоторое кол-во сладостей
     * @param name - тип сладости
     * @param weight - вес сладости
     * @param cost - стоиомсть сладости
     * @param uniq - уникальная особенность сладости
     * @param count - кол-во добавляемых сладостей
     */
    public void addCandies(){
        String name = "";
        double weight;
        double cost;
        String uniq = "";
        int count;

        //Считываем данные
        System.out.print("Введите имя сладости: ");
        name = scanner.next();
        System.out.print("Введите вес в граммах: ");
        while(!scanner.hasNextDouble()){
            System.err.print("Некорректное значение, повторите: ");
            scanner.next();
        }
        weight = Double.parseDouble(scanner.next());
        System.out.print("Введите стоимость за 100г: ");
        while(!scanner.hasNextDouble()){
            System.err.print("Некорректное значение, повторите: ");
            scanner.next();
        }
        cost = scanner.nextDouble();
        System.out.print("Введите уникальный параметр: ");
        uniq = scanner.next();
        System.out.print("Введите кол-во добавляемый сладостей: ");
        while(!scanner.hasNextInt()){
            System.err.print("Некорректное значение, повторите: ");
            scanner.next();
        }
        count = scanner.nextInt();
        //Добавялем объекты типа CandyGod
        for (int i = 0; i < count; i++) {
            present.add(new CandyGod(name, weight, cost, uniq));
        }
    }

    /**
     * Функция считывает тип сладости и удаляет по имени
     */
    public void delCandies(){
        System.out.print("Введите имя сладости для удаления: ");
        String s = scanner.next();

        for (int i = 0; i < present.size(); ) {
            if(s.equals(present.get(i).getName())){
                present.remove(i);
            }
            else i++;
        }

    }

    /**
     * Функция выводит состав подарка
     */
    public void getPresentInfo(){
        System.out.println("\nСостав подарка:");
        for (CandyGod candy: present) {
            System.out.println("Сладость: " + candy.getName() + ", Уникальный параметр: "+candy.getUniq()
                    + ", Цена за 100г: " + candy.getCost() + " руб, Вес: " + candy.getWeight() + " грамм");
        }
    }

    /**
     * Функция подсчитывает общие вес и стоиомость подарка, выводит в консоль
     * @param sumCost - общая стоимость
     * @param sumWeight - общий вес
     */
    public void getFinalPresentInfo(){
        double sumCost = 0;
        double sumWeight = 0;

        getPresentInfo();

        for (CandyGod candy: present) {
            sumWeight = sumWeight + candy.getWeight();
            sumCost = sumCost + candy.getCost()*candy.getWeight()/100;
        }

        System.out.println("\nИнформация о подарке:");
        System.out.println("Вес подарка: " + sumWeight + " грамм");
        System.out.println("Стоимость подарка: " + sumCost + " руб");

        scanner.close();
    }

}
