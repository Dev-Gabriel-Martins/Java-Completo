
package entities;

/**
 *
 * @author gabri
 */
public abstract class TaxPayer {
    protected String name;
    protected Double anualIncome;


    public TaxPayer(){

    }
    
    public TaxPayer(String name, Double analIncome){
    this.name = name;
    this.anualIncome = anualIncome;
    }
    
    public abstract Double tax();

}