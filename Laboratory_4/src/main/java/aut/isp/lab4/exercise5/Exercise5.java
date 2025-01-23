package aut.isp.lab4.exercise5;
public class Exercise5 {
    public static void main(String[] args) {

        AquariumController ac = new AquariumController("Fishers only", "new", 12.50F, 11.00F);
        ac.checkWaterTemperature();
        ac.checkWaterLevel();
        ac.setCurrentTime(8.00F);
        ac.setFeedingTime(16.03F);
        System.out.println(ac);

        FishFeeder ff = new FishFeeder("Fishers Only", "new", 11);
        ff.getMeals();
        ff.feed();
        ff.fillUp();
        System.out.println(ff);

        Actuator act = new Actuator("Fishers only", "new", true);
        act.turnOn();
        act.turnOff();
        System.out.println(act);

        Alarm a = new Alarm("Fishers Only", "new", true);
        a.turnOn();
        a.turnOff();

        Heater h = new Heater("Fishers Only", "new", true);
        h.turnOn();
        h.turnOff();

        Sensor s = new Sensor("Fishers only", "new", "meters");
        System.out.println(s);

        TemperatureSensor ts = new TemperatureSensor("Fishers only", "new", "meters", 5);
        ts.getValue();
        ts.setValue(5);
        System.out.println(ts);

        LevelSensor ls = new LevelSensor("Fishers only", "new", "meters", 5.00F);
        ls.getValue();
        ls.setValue(5.00F);
        System.out.println(ls);

    }
}
