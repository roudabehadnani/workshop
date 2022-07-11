package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Drink drink = new Drink(1, 20, "Coca", "small");
        Snack snack = new Snack(11, 50, "mini pizza", "Cheese");
        Candy candy = new Candy(21, 10, "Chocolate", "hard");


        int depositPool = 0;
        VendingMachineProduct vendingMachineProduct =
                new VendingMachineProduct(new Product[]{drink,snack,candy},depositPool);
        vendingMachineProduct.addCurrency(100);
        int a = 1;
        vendingMachineProduct.request(a);
        System.out.println("get Balance: " +vendingMachineProduct.getBalance());
        System.out.println("vendingMachineProduct = " + vendingMachineProduct.getDescription(a));

        int b = 11;
        vendingMachineProduct.request(11);
        System.out.println("get Balance: " +vendingMachineProduct.getBalance());
        System.out.println("vendingMachineProduct = " + vendingMachineProduct.getDescription(b));
        System.out.println("end session : " + vendingMachineProduct.endSession());

        System.out.println("vendingMachineProduct.getProducts().toString() = " + Arrays.toString(vendingMachineProduct.getProducts()));
    }

}