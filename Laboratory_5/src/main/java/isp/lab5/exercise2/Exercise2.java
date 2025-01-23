package isp.lab5.exercise2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop(0);
        SmartPhone phone = new SmartPhone(0);
        SmartWatch watch = new SmartWatch(0);

        Scanner in = new Scanner(System.in);

        System.out.println("The current battery level of the devices: \nLaptop: " + laptop.getBatteryLevel() + "\nSmartphone: " + phone.getBatteryLevel() + "\nSmartwatch: " + watch.getBatteryLevel());

        System.out.print("Would you like to charge a device? if yes type 1, if no type 0\n");
        int option = Integer.parseInt(in.nextLine());

        if(option != 0 && option != 1)
            System.out.println("Invalid option!");

        while (option == 1) {
            System.out.println("What device would you like to charge?  1 for laptop, 2 for smartphone, 3 for smartwatch, 4 for all");
            int input = Integer.parseInt(in.nextLine());
            switch (input) {
                case 1:
                    System.out.println("For how long would you like to charge the laptop?");
                    int level = Integer.parseInt(in.nextLine());
                    laptop.charge(level);
                    System.out.println("Would you like to charge another device? 1 for yes or 0 for no.");
                    option = Integer.parseInt(in.nextLine());
                    break;
                case 2:
                    System.out.println("For how long would you like to charge the laptop?");
                    int level1 = Integer.parseInt(in.nextLine());
                    phone.charge(level1);
                    System.out.println("Would you like to charge another device? 1 for yes or 0 for no.");
                    option = Integer.parseInt(in.nextLine());
                    break;
                case 3:
                    System.out.println("For how long would you like to charge the laptop?");
                    int level2 = Integer.parseInt(in.nextLine());
                    watch.charge(level2);
                    System.out.println("Would you like to charge another device? Input 1 for yes or 0 for no.");
                    option = Integer.parseInt(in.nextLine());
                    break;
                case 4:
                    System.out.println("For how long would you like to charge the devices?");
                    int level3 = Integer.parseInt(in.nextLine());
                    laptop.charge(level3);
                    phone.charge(level3);
                    watch.charge(level3);
                    System.out.println("Would you like to charge another device? Input 1 for yes or 0 for no.");
                    option = Integer.parseInt(in.nextLine());
                    break;
                default:
                    System.out.println("Invalid option!");

            }


        }
    }
}
