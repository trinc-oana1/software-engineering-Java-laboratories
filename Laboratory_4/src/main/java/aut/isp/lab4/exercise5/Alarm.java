package aut.isp.lab4.exercise5;

public class Alarm extends Actuator{


    public Alarm(String manufacturer, String model, boolean isOn) {
        super(manufacturer, model, isOn);
    }

    @Override
     public void turnOn() {System.out.println("Alarm on!");}
    @Override
    public void turnOff() { System.out.println("Alarm off!");}

}
