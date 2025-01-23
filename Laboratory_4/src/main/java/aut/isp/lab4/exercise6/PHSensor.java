package aut.isp.lab4.exercise6;

public class PHSensor extends Sensor{
    private float value;
    private float limit;
    private double pHLevel;
    private boolean alarmActivated;

    public PHSensor(String manufacturer, String model, String unitOfMeasurement, float value, float limit) {
        super(manufacturer, model, unitOfMeasurement);
        this.value = value;
        this.limit = limit;
    }
    public void monitorpH() {
        if (pHLevel < 1 || pHLevel > 12) {
            System.out.println("pH level is bad: " + pHLevel);
            if (changepH()) {
                adjustpH();
            } else {
                raiseAlarm();
            }
        } else {
            System.out.println("pH level is good: " + pHLevel);
        }
    }

    public boolean changepH() {
        return true;
    }
    public void adjustpH() {
        System.out.println("Adjusting pH...");
    }

    public void raiseAlarm() {
        alarmActivated = true;
        System.out.println("Alarm activated! pH level is critical.");
    }


    public String toString() {
        return "value = " + value + ", limit = " + limit;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}