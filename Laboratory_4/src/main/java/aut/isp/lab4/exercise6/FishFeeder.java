package aut.isp.lab4.exercise6;
public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    public static int MAX_MEALS = 14;
    public FishFeeder(String manufacturer, String model, int meals)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }

    public int getMeals() {return meals;}

    public void feed() {
        if (meals > 0)
        {
            meals--;
            System.out.println("The feeder is feeding");
        }
        else
        {
            System.out.println("Feeder is empty");
        }
    }

    public void fillUp() {
        meals = MAX_MEALS;
        System.out.println("The feeder is now full(14 meals)!");
    }
    public String toString()
    {
        return "manufacturer = " + manufacturer + ", model = " + model + ", meals = " + meals;
    }
}
