
package Vectors.Product.entities;

/**
 *
 * @author gabs
 */
public class Product2 {
    private String name;
    private double price;
    
    public Product2(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
