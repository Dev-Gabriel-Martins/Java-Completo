/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author gabri
 */
public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(){}
    
    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    private double totalPrice(){
    return price * quantity;
    }
    
}
