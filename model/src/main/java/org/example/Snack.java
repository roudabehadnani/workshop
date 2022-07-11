package org.example;

public class Snack extends Product{

    private String ingredient;

    public Snack(int id, double price, String productName, String ingredient) {
        super(id, price, productName);
        this.ingredient = ingredient;
    }

    @Override
    public String examine() {
        return " Id product: "+ getId() + " Name product: " + getProductName()+
                " price: " + getPrice()+ " ingredient: " + ingredient;
    }

    @Override
    public String use() {
        System.out.println("What product type do you want to buy? (Drink, Snack, Candy)");
        return "Snack" ;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

}
