package aut.isp.lab4.exercise5;
public class AquariumController {
    private FishFeeder feeder = new FishFeeder("Fishers only", "new", 11);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int presentTemperature;
    private float presentLevel;
    private LevelSensor lvlSensor;
    private TemperatureSensor tempSensor;
    private Actuator alarm;
    private Actuator heater;
    private float lightOnTime = 8.00F;
    private float lightOffTime = 14.00F;
    private int temperature;
    private Sensor levelSensor;
    private Sensor temperatureSensor;
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
    public void checkWaterTemperature() {
        if (temperatureSensor != null && temperatureSensor instanceof TemperatureSensor) {
        if (temperature < 24 || temperature > 27)
                turnLightsON();
            else
                turnLightsOFF();
        }
    }

    public void checkWaterLevel() {
        if (levelSensor != null) {
            if (((LevelSensor) levelSensor).getValue() < 100) {
                turnLightsON();
            } else {
                turnLightsOFF();
            }
        }
    }


    public void setFeedingTime(float feedingTime) { this.feedingTime = feedingTime; }



    public String toString()
    {
        return "manufacturer= " + manufacturer + ", model= " + model + ", currentTime= " + currentTime + ", feedingTime= " + feedingTime;
    }

}
