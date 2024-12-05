package org.miu.problem1;

import java.sql.SQLOutput;

public class TestClass {
    public static void main(String[] args) {

        //var productArr=new Product[5]; //type infer

        Product jacket=new Clothing("Winter Jacket",33.99,"Moerdeng",10);
        Electronics tv=new Electronics("Television",248,6,110.00);
        Furniture sofa=new Furniture("Acacia Sofa",598.41,"Leather",76.44);
        Clothing boot=new Clothing("Winter Boot",40.99,"Nortiv",13);
        Product wardrobe=new Furniture("Wardrobe",233.1,"Bimbol Wood",136.00);

        var productArr=new Product[]{jacket,tv,sofa,boot,wardrobe}; //type infer

        for(Product product:productArr){
            if(product!=null){
                System.out.println(product);
            }
        }
        System.out.printf("The sum of product prices is %.2f\n",sumProducts(productArr));
    }
    public static double sumProducts(Product[] col) {
        if(col==null||col.length==0) throw new IllegalArgumentException("Product cannot be null");
        double sumOfProduct=0;
        for(Product product : col){
            if(product!=null){
                sumOfProduct+=product.getPrice();
            }
        }
        return sumOfProduct;
    }
}
