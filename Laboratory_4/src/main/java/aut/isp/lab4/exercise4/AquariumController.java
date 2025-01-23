package aut.isp.lab4.exercise4;
public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder feeder = new FishFeeder("Fisher Man", "latest version", 11);
    private float lightOnTime = 8.00F;
    private float lightOffTime = 14.00F;
    private boolean light;


    public AquariumController(String manufacturer, String model, float currentTime, float feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }
     public void turnLightsON()
     {
         this.light = true;
         System.out.println("The lights are ON!");
     }
     public void turnLightsOFF()
     {
         this.light = false;
         System.out.println("The lights are OFF!");
     }


    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (this.currentTime == this.feedingTime) feeder.feed();
        if (feeder.getMeals() == 0) feeder.fillUp();
        if (this.currentTime >= this.lightOnTime && this.currentTime <= this.lightOffTime)
        {
            turnLightsON();
        }
        else
        {
            turnLightsOFF();
        }

    }

    public void setFeedingTime(float feedingTime) { this.feedingTime = feedingTime; }

    public String toString()
        {
            return "manufacturer= " + manufacturer + ", model= " + model + ", currentTime= " + currentTime + ", feedingTime= " + feedingTime;
        }

}
