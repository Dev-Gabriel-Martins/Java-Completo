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
    super();
    this.HealthEpenditures = HealthEpenditures; 
    }
        
    @Override
    public Double tax(){       
        return (anualIncome * 0.25 )-(HealthEpenditures * 0.5);
    }

    
}
