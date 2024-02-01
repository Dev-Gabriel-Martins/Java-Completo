/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gabri
 */
public class Individual extends TaxPayer {
    
    private Double healthEpenditures;
    
    public Individual(){}
    
    public Individual(String name, Double anualIncome, Double healthEpenditures){
    super(name, anualIncome);
    this.healthEpenditures = healthEpenditures; 
    }
    
    

    public Double getHealthEpenditures() {
        return healthEpenditures;
    }

    public void setHealthEpenditures(Double HealthEpenditures) {
        this.healthEpenditures = healthEpenditures;
    }       
    
    @Override
    public Double tax(){       
        double basicTax;
        if(getAnualIncome() < 20000.0){
            basicTax = getAnualIncome() * 0.15;
        }else{
           basicTax = getAnualIncome() * 0.25;                
        }
        basicTax = basicTax - (getHealthEpenditures() * 0.5);
        if(basicTax < 0.0){
        basicTax = 0.0;
        }
      return basicTax;  
    }    
}
