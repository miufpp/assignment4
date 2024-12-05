package org.miu.problem1;

public class Furniture extends Product{
    private String material;
    private double shippingCost;
    public Furniture(String name,double price,String material,double shippingCost){
        super(name,price);
        this.material=material;
        this.shippingCost=shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+this.shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "productName=" + getProductName() +
                ", price=" + getPrice() +
                //", price=" + price +
                ", material=" + material +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
