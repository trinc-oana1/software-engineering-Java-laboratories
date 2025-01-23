package aut.isp.lab4.exercise5;

public class Sensor {
    private String manufacturer;
    private String model;
    private String unitOfMeasurement;

    public Sensor(String manufacturer, String model, String unitOfMeasurement)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.unitOfMeasurement = unitOfMeasurement;
    }
    public String toString() {return "manufacturer = " + manufacturer + ", model = " + model + ", unitOfMeasurement = " + unitOfMeasurement;}
}
