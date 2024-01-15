package entities;
/**
 *
 * @author gabri
 */
public class Company extends TaxPayer {
    
    private Integer numberEnployees;
    
    public Company(){}
    
    public Company(String name, Double anualIncome, Integer numberEnployees){        
    super(name, anualIncome);
    this.numberEnployees = numberEnployees;
    }
    
    @Override
    public Double tax() {
        if (numberEnployees > 10 ){
        return anualIncome * 0.14;
        }
     return anualIncome * 0.16;
    }
    
}
