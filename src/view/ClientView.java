package view;

import models.Client;
import utils.TryCatchValidator;

import java.util.Scanner;

public class ClientView {
    Client model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public ClientView(Client model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите название: ";
        System.out.print(title);
        try {
            name = TryCatchValidator.checkValidName(scanner);
        } catch (Exception e) {
            System.out.print("Пусто! Введите имя клиента: ");
            name = scanner.nextLine().trim();

        }
        model.setName(name);


        title = "Введите кол-во: ";
        System.out.print(title);
        try {
            quantity = TryCatchValidator.checkValidQnty(scanner);
        } catch (Exception e) {
            System.out.println("Неверное значение! Введите количество: ");
            quantity = scanner.nextInt();
        }
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.print(title);
        try {
            price = TryCatchValidator.checkValidPrice(scanner);
        } catch (Exception e) {
            System.out.print("Неверное значение! Введите цену: ");
            price = scanner.nextDouble();
        }
        model.setPrice(price);

        scanner.close();
        }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

