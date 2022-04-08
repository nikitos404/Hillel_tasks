package controllers;
import models.Client;
import utils.Rounder;
import view.ClientView;

public class ClientController {

    Client model;
    ClientView view;

    // Конструктор
    public ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double priceToPay = model.сalculatePaymentBill(model.getQuantity(), model.getPrice());
        String paymentInitialRounded = Rounder.roundValue(priceToPay);

        double discount = model.сalculateDiscount(priceToPay);
        String discountRounded = Rounder.roundValue(discount);

        String paymentRounded = Rounder.roundValue(model
                .сalculatePaymentWithDiscount(priceToPay, discount));

        String output = "------------------------------\n" +
                "Имя клиента: " + name + "\n" +
                "Сума покупки (грн.): " + paymentInitialRounded + "\n" +
                "Сумма скидки (грн.): " + discountRounded + "\n" +
                "К оплате (грн.): " + paymentRounded;

        view.getOutput(output);
    }
}
