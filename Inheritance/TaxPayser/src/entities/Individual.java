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
    
    private double HealthEpenditures;
    
    public Individual(){}
    
    public Individual(String name, Double anualIncome, Double HealthEpenditures){
    super(name, anualIncome);
    this.HealthEpenditures = HealthEpenditures; 
    }

    public double getHealthEpenditures() {
        return HealthEpenditures;
    }

    public void setHealthEpenditures(double HealthEpenditures) {
        this.HealthEpenditures = HealthEpenditures;
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
