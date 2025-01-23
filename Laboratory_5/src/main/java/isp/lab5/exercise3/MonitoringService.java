package isp.lab5.exercise3;

public class MonitoringService {
    private Sensor[] sensors;
    public double getAverageTemperatureSensors(){
        double s=0;
        int m=0;
        for (Sensor sensor : sensors) {
            if (sensor.getClass() == TemperatureSensor.class) {
                s += ((TemperatureSensor) sensor).getTemperature();
                m++;
            }
        }

        if(m!=0)
            return (double)s/m;
        else
            return 0;
    }
    public double getAverageAllSensors(){
        double s=0;
        int m=0;
        for (Sensor sensor : sensors) {
            if(sensor.getClass() == TemperatureSensor.class) {
                s += ((TemperatureSensor) sensor).getTemperature();
                m++;
            }else if (sensor.getClass() == PressureSensor.class) {
                s += ((PressureSensor) sensor).getPressure();
                m++;

            }

        }

        if(m!=0)
            return (double)s/m;
        else
            return 0;
    }

    public Sensor[] getSensors() {return sensors;}
}
