package isp.lab5.exercise3;

public class PressureSensor extends Sensor {
    private double pressure;

    public PressureSensor(String installLocation, String name, double pressure)
    {
        super(installLocation, name);
        this.pressure = pressure;
    }


    public void setPressure(double pressure) {this.pressure = pressure;}
    public double getPressure() {return pressure;}
    public String toString() {
        return "pressure = " +pressure;
    }
}
