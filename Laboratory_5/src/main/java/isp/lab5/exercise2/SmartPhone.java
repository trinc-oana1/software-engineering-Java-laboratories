package isp.lab5.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel;

    public SmartPhone(int batteryLevel) {this.batteryLevel = batteryLevel;}

    public void setBatteryLevel(int batteryLevel) {this.batteryLevel = batteryLevel;}
    public int getBatteryLevel() {return batteryLevel;}

    public void charge(int durationInMinutes)
    {
        for(int i=0; i<=durationInMinutes; i++)
        {
            batteryLevel += 2;
        }
        if(batteryLevel>=100) setBatteryLevel(100);
        System.out.println("The battery level of the Smartphone is: " + batteryLevel);
    }

}

