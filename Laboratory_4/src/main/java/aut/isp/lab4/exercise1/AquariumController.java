package aut.isp.lab4.exercise1;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    public AquariumController(String manufacturer, String model, float currentTime)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }

    public float getCurrentTime() { return currentTime;}
    public void setCurrentTime(float currentTime) {this.currentTime = currentTime;}
    public String toString()
    {
       return "manufacturer= " + manufacturer + ", model= " + model + ", currentTime= " + currentTime;
    }


    //attributs
    //constructors
    //methods
}
