public class Recipe {

    //Write your solution here
    String name;
    String ingredients;
    int servingSize;
    double cost;

    public double costPerPerson() {
        return cost / servingSize;
    }

    public String toString() {
        return "Recipe for " + name + " will require these ingredients:\n" +
                ingredients + "\nThis dish will serve " + servingSize +
                " people and cost a total of $ " + cost + " to make";
    }
}
