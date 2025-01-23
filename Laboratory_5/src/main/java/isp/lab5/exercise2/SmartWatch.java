package isp.lab5.exercise2;

public class SmartWatch implements Chargeable{
    private int batteryLevel;
    public SmartWatch(int batteryLevel) {this.batteryLevel = batteryLevel;}

    public void setBatteryLevel(int batteryLevel) {this.batteryLevel = batteryLevel;}
    public int getBatteryLevel() {return batteryLevel;}

    public void charge(int durationInMinutes)
    {
        for(int i=0;i<=durationInMinutes;i++)
        {
            batteryLevel += 1;
        }
        if(batteryLevel>=100) setBatteryLevel(100);
        System.out.println("The battery level of the Smartwatch is: " + batteryLevel);
    }
}

