package org.example.model;

public class Bread extends ProductForSale{

    private boolean isWheat;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }

    public boolean isWheat() {
        return this.isWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Product type : " + getType());
        System.out.println("Product price : " + getPrice());
        System.out.println("Product description : " + getDescription());
        System.out.println("Product description : " + isWheat());
    }
}
