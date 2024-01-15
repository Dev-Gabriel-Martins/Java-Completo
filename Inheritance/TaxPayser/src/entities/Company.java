package entities;
/**
 *
 * @author gabri
 */
public class Company extends TaxPayer {
    
    private Integer NumberEnployees;
    
    @Override
    public Double tax() {
    
     return 0.0;
    }
    
}
