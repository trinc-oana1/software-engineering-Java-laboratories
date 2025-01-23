package isp.lab3.exercise5;
import java.util.Scanner;

public class VendingMachine {
    private String[] products = new String[]{"Water", "Juice", "Chocolate", "Chips", "Candy"};
    private int credit = 0;


    public void displayProducts() {
        System.out.println("The products: ");
        int i = 0;
        for (i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ": " + products[i]);
        }
    }

    public void insertCoin(int value) {
        credit += value;
        System.out.println("You inserted " + value + " coins.");
    }

    public void selectProduct(int id) {
        switch (id) {
            case 1 -> System.out.println("You selected: " + products[0]);
            case 2 -> System.out.println("You selected: " + products[1]);
            case 3 -> System.out.println("You selected: " + products[2]);
            case 4 -> System.out.println("You selected: " + products[3]);
            case 5 -> System.out.println("You selected: " + products[4]);
            default -> System.out.println("Product unavailable");

        }
    }

    public void displayCredit() {
        System.out.println("Your total credit is: " + credit);

    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWELCOME TO THE VENDING MACHINE MENU");
            System.out.println("\n1. Display products");
            System.out.println("\n2. Insert the coins");
            System.out.println("\n3. Select the wanted product");
            System.out.println("\n4. Display the credit");
            System.out.println("\n0. Exit");

            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayProducts();
                case 2 -> {
                    System.out.println("\nEnter the number of coins");
                    int value = scanner.nextInt();
                    insertCoin(value);
                }
                case 3 -> {
                    System.out.println("\nEnter the id of the wanted product");
                    int id = scanner.nextInt();
                    selectProduct(id);
                }
                case 4 -> displayCredit();
                case 0 -> System.out.println("See you next time...");
                default -> System.out.println("Invalid choice, try again.");
            }


        } while (choice != 0);

    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.displayProducts();
        vm.insertCoin(10);
        vm.selectProduct(2);
        vm.displayCredit();
        vm.userMenu();
    }


}