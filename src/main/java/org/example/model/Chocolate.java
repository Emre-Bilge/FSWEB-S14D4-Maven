package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean isWithMilk;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public boolean getIsWithMilk(){
        return this.isWithMilk;
    }
    @Override
    public void showDetails() {
        System.out.println("Product type : " + getType());
        System.out.println("Product price : " + getPrice());
        System.out.println("Product description : " + getDescription());
        System.out.println("Product is with milk ? : " + getIsWithMilk());
    }


}
