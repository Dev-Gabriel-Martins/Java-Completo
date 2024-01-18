
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    
    
    
    
    public abstract Double tax();

}