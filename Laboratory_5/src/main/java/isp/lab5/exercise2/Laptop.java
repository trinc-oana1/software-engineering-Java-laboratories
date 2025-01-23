package isp.lab5.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel;

    public  Laptop(int batteryLevel) {this.batteryLevel = batteryLevel;}


    public void setBatteryLevel(int bateryLevel) {this.batteryLevel = batteryLevel;}
    public int getBatteryLevel() {return batteryLevel;}


    public void charge(int durationInMinutes)
    {
        for(int i=0; i<=durationInMinutes; i++)
        {
            batteryLevel += 3;
        }
        if(batteryLevel>=100) setBatteryLevel(100);
        System.out.println("The battery level of the Laptop is: " + batteryLevel);

    }


}