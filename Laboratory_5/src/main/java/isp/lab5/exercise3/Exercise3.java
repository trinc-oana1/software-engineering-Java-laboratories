package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String[] args) {


        MonitoringService ms = new MonitoringService();
        PressureSensor ps = new PressureSensor("Outside", "ps1", 10);
        TemperatureSensor ts = new TemperatureSensor("Inside", "ts1", 27);
        Sensor[] sensors = new Sensor[10];
        sensors[0] = new Sensor("Outside", "s0");
        sensors[1] = new Sensor("Inside", "s1");
        sensors[2] = new Sensor("Outside", "s2");
        sensors[3] = new Sensor("Inside", "s3");
        sensors[4] = new Sensor("Outside", "s4");
        sensors[5] = new Sensor("Inside", "s5");
        sensors[6] = new Sensor("Outside", "s6");
        sensors[7] = new Sensor("Inside", "s7");
        sensors[8] = new Sensor("Outside", "s8");
        sensors[9] = new Sensor("Inside", "s9");
        System.out.println(ps);
        System.out.println(ts);
    }


}

