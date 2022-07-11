package org.example;

public class Candy extends Product{

    private String type;

    public Candy(int id, double price, String productName, String type) {
        super(id, price, productName);
        this.type = type;
    }

    @Override
    public String examine() {
        return " Id product: "+ getId() + " Name product: " +
                getProductName()+ " price: " + getPrice()+ " type: " + type;
    }

    @Override
    public String use() {
        System.out.println("What product type do you want to buy? (Drink, Snack, Candy)");
        return "Candy" ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
