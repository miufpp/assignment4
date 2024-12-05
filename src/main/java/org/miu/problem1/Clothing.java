package org.miu.problem1;

public class Clothing extends Product{
    private final String BRAND;
    private float discountpercentage;
    protected Clothing(String productName, double price, String brand, float discount) {
        super(productName, price);
        this.BRAND=brand;
        this.discountpercentage=discount/100;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*(1-discountpercentage);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "productName=" + getProductName() +
                ", price=" + this.getPrice() +
                ", brand=" + BRAND +
                ", discountpercentage=" + discountpercentage +
                '}';
    }
}
