package sweets;

/**
 * Класс сладости
 * @param name - тип сладости
 * @param weight - вес сладости
 * @param cost - стоиомсть сладости
 * @param uniq - уникальная особенность сладости
 */
public class CandyGod {
    private String name;
    private double weight;
    private String uniq;
    private double cost;

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public String getUniq(){
        return uniq;
    }

    public double getCost(){
        return cost;
    }

    public CandyGod(String name, double weight, double cost, String uniq){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.uniq = uniq;
    }
}
