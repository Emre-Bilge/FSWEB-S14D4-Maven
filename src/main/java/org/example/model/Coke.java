package org.example.model;

public class Coke extends ProductForSale{
    private String name;

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }
public String getName(){
        return name ;
    }
    @Override
    public void showDetails() {
        System.out.println("Product type : " + getType());
        System.out.println("Product price : " + getPrice());
        System.out.println("Product description : " + getDescription());
        System.out.println("Product description : " + getName());
    }
}
