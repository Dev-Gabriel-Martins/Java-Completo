
package Vectors.Product.application;


import Vectors.Product.entities.Product2;
import java.util.Scanner;
import java.util.Locale; 
/**
 *
 * @author gabs
 */
public class Main {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Product2[] vect = new Product2[n];
        
        for (int i=0;i< n; i++){
        System.out.println("Product "+(i+1)+"- Enter with name and price: ");
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        
        vect[i] = new Product2(name, price); 
        
        }
        
        double sum =0.0;
        for(int i=0; i <n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum /n;
        
        System.out.println("Average price: "+ avg);
        
        
    }
}
