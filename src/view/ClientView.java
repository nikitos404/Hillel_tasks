package view;

import models.Client;
import utils.IndividualExceptions;
import utils.TryCatchValidator;
import java.util.Scanner;

public class ClientView {
    Client model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public ClientView (Client model){
        this.model = model;
    }

    public void getInputs(){

        scanner = new Scanner(System.in);

        title = "Введите имя клиента: ";
        System.out.print(title);
        try {
            name = TryCatchValidator.ValidateName01(scanner);
        } catch (IndividualExceptions e) {
            e.printStackTrace();
        } try {
            name = TryCatchValidator.ValidateName02(scanner);
        } catch (IndividualExceptions e) {
            e.printStackTrace();
        }
        model.setName(name);

        title = "Введите количество: ";
        System.out.print(title);
        try {
            quantity = Integer.parseInt(TryCatchValidator.ValidatePrice(scanner));
        } catch (IndividualExceptions e) {
            e.printStackTrace();
        }
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.print(title);
        try {
            price = Double.parseDouble(TryCatchValidator.ValidateQuota(scanner));
        } catch (IndividualExceptions e) {
            e.printStackTrace();
        }
        model.setQuantity(quantity);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}