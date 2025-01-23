package isp.lab6.exercise3;
import java.net.PasswordAuthentication;
import java.util.Comparator;
import java.util.Scanner;

public class UserInterface {
    private LoginSystem loginSyst;
    private OnlineStore store;
    UserInterface()
    {
        store=new OnlineStore();
        loginSyst=new LoginSystem(store);
    }


    public static void menulogin() {
        System.out.println("WELCOME");
        System.out.println("Please input the index of the wanted action(Make sure you register first!)\n");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Exit");
    }

    public static void menustore() {
        System.out.println("WELCOME TO THE ONLINE STORE");
        System.out.println("Please input the index of the wanted action!\n");
        System.out.println("1.Product list");
        System.out.println("2.Product ordered by price");
        System.out.println("3.Add product to cart");
        System.out.println("4.Checkout");
        System.out.println("5.Logout");

    }

    public void loadinterface()
    {
        Scanner cin = new Scanner(System.in);
        menulogin();
        int opt1 = cin.nextInt();
        int opt2;
        String user, password;
        while (true) {
            switch (opt1) {
                case 1 -> {
                    System.out.println("Select a username:");
                    user = cin.next();
                    System.out.println("Select a password:");
                    password = cin.next();
                    loginSyst.register(user, password);
                    System.out.println("Account Created!");
                }
                case 2 -> {
                    System.out.println("Input your user:");
                    user = cin.next();
                    System.out.println("Input your password:");
                    password = cin.next();
                    if (loginSyst.login(user, password)) {
                        menustore();
                        opt2 = cin.nextInt();
                        boolean x = true;
                        while (x) {
                            switch (opt2) {
                                case 1 -> System.out.println(store.getProducts());
                                case 2 -> {
                                    Comparator<Product> sortByPrice = Comparator.comparing(Product::getPrice);
                                    System.out.println(store.getProductsSorted(sortByPrice));
                                }
                                case 3 -> {
                                    System.out.println("Input the item index:\n1=ZARA jeans\n2=ZARA bag\n3=ZARA hoodie\n4=ZARA winter jacket\n");
                                    int item = cin.nextInt();
                                    item--;
                                    System.out.println("Input quantity:");
                                    int quant = cin.nextInt();
                                    Product test = store.getProducts().get(item);
                                    store.addToCart(user, test, quant);
                                }
                                case 4 -> System.out.println(store.checkout(user));

                                case 5 -> {
                                    System.out.println("Input logout username:");
                                    user = cin.next();
                                    x = false;
                                    loginSyst.logout(user);
                                }
                                case 6 -> x = false;
                                default -> System.out.println("Invalid option, try again!");
                            }
                            menustore();
                            opt2 = cin.nextInt();
                        }
                    }
                }
                case 3 -> System.exit(0);

                default -> {
                    System.out.println("Invalid option, try again!");

                    menulogin();
                    opt1 = cin.nextInt();
                }
            }

            }
        }
    }

