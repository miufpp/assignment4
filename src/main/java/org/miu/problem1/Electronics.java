package org.miu.problem1;

import java.time.LocalDate;

public class Electronics extends Product{
    private int warranty;
    private double warrantyCost;
    protected Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty=warranty;
        this.warrantyCost=warrantyCost;
    }
    public Electronics(String pname,double price){
        super(pname,price);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "productName=" + getProductName() +
                ", price=" + getPrice() +
                ", warranty=" + warranty +
                ", warrantyCost=" + warrantyCost +
                '}';
    }
}
