package org.example;

import java.util.Arrays;

public class VendingMachineProduct implements VendingMachine{

    private Product[] products;
    private int depositPool;

    public VendingMachineProduct(Product[] products, int depositPool) {
        this.products = products;
        this.depositPool = depositPool;
    }



    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }



    @Override
    public void addCurrency(int amount) {
        int [] depositPools = {1,2,5,10,20,50,100,200,500,1000 };
        for (int a : depositPools) {
            if (a == amount) {
                setDepositPool(amount);
                System.out.println("Your deposit is : " + getDepositPool());
                break;
            }

        }

    }

    @Override
    public int getBalance() {
        for (Product a : products) {
            depositPool -= a.getPrice();
            return depositPool;
        }
        return 0;
    }

    @Override
    public Product request(int id) {
        for (Product i : products) {
           if (i.getId() == id && i.getPrice() <= depositPool){
               return i;
           }
        }
        return null;
    }

    @Override
    public int endSession() {
        for ( Product i : products) {
            depositPool = 0;
        }
        return depositPool;
    }

    @Override
    public String getDescription(int id) {
        for ( Product i : products) {
            if ( i.getId() == id){
                return i.examine();
            }
        }
        return "It is invalid product";
    }

    @Override
    public String[] getProducts() {
        String [] arrays = new String[0];
        for (Product i : products) {
            String[] productName = Arrays.copyOf(arrays, arrays.length + 1);
            productName[arrays.length] = i.examine();
            arrays = Arrays.copyOf(productName, productName.length);
        }
        return arrays;
    }

}
