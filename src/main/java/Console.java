import services.MineralServices;
import services.VitaminsServices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public static void printWelcome() {
        System.out.println("\n" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
        productInventoryMenu();
    }

    public static void productInventoryMenu() {

        VitaminsServices vitaminsServices = new VitaminsServices();
        MineralServices mineralServices = new MineralServices();

        Scanner scanner = new Scanner(System.in);
        boolean menuOn = true;
        while (menuOn) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Create different products to be added to inventory\n" +
                    "2 - Read from existing products\n" +
                    "3 - Delete products\n" +
                    "4 - Exit the program\n" +
                    "Please enter your choice here -> ");

            try {
                int menuInput = scanner.nextInt();
                switch (menuInput) {
                    case 1:
                        String newName = "";
                        String newBrand = "";
                        int newQty = 0;
                        float newPrice = 0f;
                        System.out.println("Which product would you like to create?\n" +
                                "1 - Vitamin, 2 - Mineral");
                        int productToBeAddedChoice = scanner.nextInt();
                        System.out.println("Please provide the name of the new product you would like to create:");
                        scanner.next();
                        newName = scanner.nextLine();
                        System.out.println("Please provide the brand of the new product you would like to create:");
                        newBrand = scanner.nextLine();
                        System.out.println("Please provide the quantity in the bottle of the new product you would like to create:");
                        newQty = scanner.nextInt();
                        System.out.println("Please provide the price of the new product you would like to create:");
                        newPrice = scanner.nextFloat();
                        if (productToBeAddedChoice == 1) {
                            vitaminsServices.create(newName, newBrand, newQty, newPrice);
                        } else {
                            mineralServices.create(newName, newBrand, newQty, newPrice);
                        }
                        break;
                    case 2:
                        System.out.println("Here is a list of all the vitamins in inventory:");
                        System.out.println(vitaminsServices.printAll());
                        System.out.println("Here is a list of all the minerals in inventory:");
                        System.out.println(mineralServices.printAll());
                        break;
                    case 3:
                        int itemToBeDeleted;
                        System.out.println("Which type of product would you like to delete?\n" +
                                "1 - Vitamin, 2 - Mineral");
                        int typeOfProductToBeDeletedChoice = scanner.nextInt();
                        if (typeOfProductToBeDeletedChoice == 1) {
                            System.out.println("Here is a list of all the vitamins in inventory:");
                            System.out.println(vitaminsServices.printAll());
                            System.out.println("What item would you like to delete?");
                            itemToBeDeleted = scanner.nextInt();
                            vitaminsServices.delete(itemToBeDeleted);
                            System.out.println("Here is a list of all the vitamins in inventory after you deleted one:");
                            System.out.println(vitaminsServices.printAll());
                        } else {
                            System.out.println("Here is a list of all the minerals in inventory:");
                            System.out.println(mineralServices.printAll());
                            System.out.println("What item would you like to delete?");
                            itemToBeDeleted = scanner.nextInt();
                            mineralServices.delete(itemToBeDeleted);
                            System.out.println("Here is a list of all the vitamins in inventory after you deleted one:");
                            System.out.println(mineralServices.printAll());
                        }
                        break;
                    case 4:
                        menuOn = false;
                        System.out.println("Exiting...");
                        break;

                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n" + "Err - Choose a correct option, please read the instructions carefully.");
            }
        }


    }
}
