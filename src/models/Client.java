package models;
import base.*;

public class Client implements PaymentBill, DiscountBill{
    private String name;
    private int quantity;
    private double price;
    private final static double DISCOUNT = 12.5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){
        return  quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public double сalculateDiscount(double priceToPay) {
        return priceToPay * DISCOUNT / 100;
    }

    @Override
    public double сalculatePaymentBill(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double сalculatePaymentWithDiscount(double priceToPay, double discount) {
        return priceToPay - discount;
    }
}
