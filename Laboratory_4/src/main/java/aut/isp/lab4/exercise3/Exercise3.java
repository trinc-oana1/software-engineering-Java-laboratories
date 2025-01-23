package aut.isp.lab4.exercise3;
public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("\nThe data of the Aquarium Controller: ");
        AquariumController a1 = new AquariumController("Emerson", "new", 2.30F, 14.50F);
        a1.setCurrentTime(2.30F);
        a1.setFeedingTime(14.50F);
        System.out.println(a1);

        System.out.println("\nThe data of the Fish Feeder: ");
        FishFeeder ff1 = new FishFeeder("Bosch", "new", 12);
        ff1.feed();
        ff1.fillUp();
        System.out.println(ff1);

    }
}
