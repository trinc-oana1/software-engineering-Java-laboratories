package isp.lab7.safehome;
import java.util.Scanner;

public class SafeHome {
    static void mainMenu()
    {
        System.out.println("\t\tMAIN MENU");
        System.out.println("1.Log as ADMIN");
        System.out.println("2.Log as TENANT");
        System.out.println("3.EXIT");
    }

    static void adminMenu()
    {
        System.out.println("\t\tADMIN MENU");
        System.out.println("1.ADD TENANT");
        System.out.println("2.REMOVE TENANT");
        System.out.println("3.ENTER MASTER PIN");
        System.out.println("4.CHECK ACCESS LOGS");
        System.out.println("5.BACK");
    }

    static void tenantMenu()
    {
        System.out.println("\t\tTENANT MENU");
        System.out.println("1.ENTER PIN");
        System.out.println("2.BACK");
    }
    public static void main(String[] args) {
        ControllerInterface face=new DoorLockController();
        Scanner cin=new Scanner(System.in);
        int choice1,choice2,choice3;
        mainMenu();
        int ok1;
        choice1=cin.nextInt();
        while(true)
        {
            switch(choice1) {
                case 1:
                    System.out.println("Input pin:");
                    String pin = cin.next();
                    if (pin.equals(ControllerInterface.MASTER_KEY)) {
                        //menu2();
                        System.out.println("Press any key from 0->9 to see the menu");
                        choice2 = cin.nextInt();
                        ok1=1;
                        do
                        {
                            adminMenu();
                            choice2 = cin.nextInt();
                            switch (choice2) {
                                case 1:
                                    System.out.println("Input a new name:");
                                    String user = cin.next();
                                    System.out.println("Input access key:");
                                    String key = cin.next();
                                    try {
                                        face.addTenant(key, user);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 2:
                                    System.out.println("Input tenant to remove:");
                                    user = cin.next();
                                    try {
                                        face.removeTenant(user);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 3:
                                    try {
                                        face.enterPin(ControllerInterface.MASTER_KEY);
                                    } catch (Exception e) {
                                        System.out.println("Something went wrong!");
                                    }
                                    break;
                                case 4:
                                    face.displayAccessLog();
                                    break;
                                case 5:
                                    ok1 = 0;
                                    break;
                            }
                        }while(ok1==1);
                    }
                    break;
                case 2:
                    ok1=1;
                    do
                    {
                        tenantMenu();
                        choice2 = cin.nextInt();
                        switch (choice2)
                        {
                            case 1:
                                System.out.println("Input pin:");
                                pin= cin.next();
                                try {
                                    face.enterPin(pin);
                                }catch(Exception e)
                                {
                                    System.out.println(e.getMessage());
                                }
                                finally{
                                    System.out.println(face.doorStatus());
                                }
                                break;
                            case 2:
                                ok1=0;
                                break;
                        }
                    }while(ok1==1);
                    break;
                case 3:System.exit(0);
                    break;
            }
            mainMenu();
            choice1=cin.nextInt();
        }


    }
}
