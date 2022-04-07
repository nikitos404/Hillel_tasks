package base;

public interface PaymentBill {
    double CalculatePaymentBill(int quantity, double price);

    double CalculatePaymentWithDiscount(double discount, double priceToPay);
}
