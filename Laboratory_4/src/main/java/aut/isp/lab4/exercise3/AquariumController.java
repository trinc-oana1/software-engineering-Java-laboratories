package aut.isp.lab4.exercise3;
public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder feeder = new FishFeeder("Bosch", "new", 12);


    public AquariumController(String manufacturer, String model, float currentTime, float feedingTime)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }
    public AquariumController(FishFeeder feeder, String manufacturer, String model, float currentTime, float feedingTime)
    {
        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }
    public void setCurrentTime(float currentTime)
    {
        this.currentTime = currentTime;
        if(this.currentTime == this.feedingTime)  feeder.feed();
        if ( feeder.getMeals() == 0) feeder.fillUp();

    }

    public void setFeedingTime(float feedingTime) {this.feedingTime = feedingTime;}


    public String toString()
    {
        return "manufacturer= " + manufacturer + ", model= " + model + ", currentTime= " + currentTime + ", feedingTime= " + feedingTime;
    }
}

