
package CurrencyConverter.util;

/**
 *
 * @author gabs
 */
public class CurrencyConverter {    
    
    public static double calc (double quatation, double quantity){
    double dollar = quatation * quantity;
    
    double IOF = (dollar * 6) / 100;        
        System.out.println("IOF: "+ IOF);
        
        return dollar + IOF;
    }
    
    
}


