package utils;

import java.util.Scanner;

public class TryCatchValidator {
    public static String checkValidName(Scanner scanner) throws IndividualExceptions {
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            throw new IndividualExceptions("\n" + "Run the App again");

        } else {
            return name;
        }

    }

    public static int checkValidQnty(Scanner scanner) throws IndividualExceptions {
        int quantity = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            throw new IndividualExceptions("\n" + "Run the App again");

        } else {
            return quantity;
        }
    }

    public static double checkValidPrice(Scanner scanner) throws IndividualExceptions {
        double price = scanner.nextDouble();
        if (!scanner.hasNextDouble()) {
            throw new IndividualExceptions("\n" + "Run the App again");
        } else {
            return price;
        }

    }
}
