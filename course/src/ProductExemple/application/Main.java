package ProductExemple.application;

import ProductExemple.entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Enter product data: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        product.setName(name);
        
        System.out.println("Price: ");
        double price = sc.nextDouble();
        product.setPrice(price);
        
        System.out.println("Quantity in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        
        System.out.println();
        System.out.println("Product data: "+product);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: "+product);
        
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: "+product);
        
        sc.close();
    }
}
