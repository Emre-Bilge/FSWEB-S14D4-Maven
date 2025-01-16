package org.example.model;

public class Store {
    public static void main(String[] args) {
ProductForSale[] products = new ProductForSale[3];

products[0] = new Chocolate("alpella",30,"sütlü kaplama");
products[1]= new Coke("pepsi",25,"whu");
products[2] = new Bread("ekmek",12.5,"ev ekmeği");




        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
    for(int i = 0 ; i < products.length ; i++){
        products[i].showDetails();
        System.out.println("*************");
    }
    }
}