package isp.lab5.exercise2;

/**
 * @author Radu Miron
 */
public interface Chargeable {
    public int batteryLevel = 0 ;

    public default int getBatteryLevel() {return batteryLevel;}
    void charge(int duration);


}
