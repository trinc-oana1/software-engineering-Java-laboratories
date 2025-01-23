package aut.isp.lab4.exercise6;

public class Actuator {
    private String manufacturer;
    private String model;
    private boolean isOn;
    public Actuator(String manufacturer, String model, boolean isOn)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isOn = isOn;
    }
    public void turnOn() {System.out.println("Alarm on!");}

    public void turnOff() { System.out.println("Alarm off!");}
    public String toString() {return "manufacturer= " + manufacturer + ", model= " + model + ", isOn= " + isOn;}
}
