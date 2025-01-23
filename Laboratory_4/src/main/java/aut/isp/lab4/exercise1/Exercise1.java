package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController  a1 = new AquariumController("FishWorld", "new", 12);
        a1.getCurrentTime();
        a1.setCurrentTime(12);
        System.out.println(a1);
        //create an object
    }
}
