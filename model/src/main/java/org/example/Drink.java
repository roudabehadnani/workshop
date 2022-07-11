package org.example;

public class Drink extends Product{

    private String size;

    public Drink(int id, double price, String productName, String size) {
        super(id, price, productName);
        this.size = size;
    }

    @Override
    public String examine() {
        return " Id product: "+ getId() + " Name product: " + getProductName()+
                " price : " + getPrice()+ " size : " + getSize();
    }

    @Override
    public String use() {
        System.out.println("What product type do you want to buy? (Drink, Snack, Candy)");
        return "Drink" ;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



}
