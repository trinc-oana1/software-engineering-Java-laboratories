package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {

        System.out.println("\nThe data of the Aquarium Controller: ");
        AquariumController a1 = new AquariumController("Fishing", "latest version", 7.00F, 15.30F);
        a1.setCurrentTime(7.00F);
        a1.setFeedingTime(15.30F);
        System.out.println(a1);

        System.out.println("\nThe data of the Fish Feeder: ");
        FishFeeder ff1 = new FishFeeder("Fisher Man", "latest version", 11);
        ff1.feed();
        ff1.fillUp();
        System.out.println(ff1);

    }
}
