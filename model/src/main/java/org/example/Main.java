package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Drink drink = new Drink(1, 20, "Coca", "small");
        Snack snack = new Snack(11, 50, "mini pizza", "Cheese");
        Candy candy = new Candy(21, 10, "Chocolate", "hard");


        int depositPool = 0;
        Scanner scanner = new Scanner(System.in);

        VendingMachineProduct vendingMachineProduct = new VendingMachineProduct(new Product[]{drink, snack, candy},depositPool);

        System.out.print(" Pls put money in the machine: ");
        int money = scanner.nextInt();
        vendingMachineProduct.addCurrency(money);
        boolean run = true;
        while(run) {
            System.out.println("This is a list of products, pls request a product by choosing the product's id: ");
            System.out.println("The list of products in detail: " + Arrays.toString(vendingMachineProduct.getProducts()));
            int getInt = VendingMachineProduct.getIntFromUser();
            Product i = vendingMachineProduct.request(getInt);
            int balance = vendingMachineProduct.getBalance();
            System.out.println("get Balance: " + balance);
            System.out.println("Do you want to continue?(y/n)");
            String getString = VendingMachineProduct.getStringFromUser();
            if (getString.equalsIgnoreCase("n")) {
                System.out.println("you get back change: " + balance);
                System.out.println("vendingMachineProduct = " +i.getProductName() );
                System.out.println("end session : " +vendingMachineProduct.endSession() );
                run = false;
            }
        }

    }

}