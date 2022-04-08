package base;

public interface PaymentBill {
    double сalculatePaymentBill(int quantity, double price);

    double сalculatePaymentWithDiscount(double priceToPay, double discount);
}
