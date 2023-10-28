
package SalaryIncrease.entities;


public class Payslip {
    
    private Integer id;
    private String name;
    private Double salary;
    
    public Payslip(){
    
    }

    public Payslip(Integer id, String name, Double salary){
    super();
    this.id = id;
    this.name = name;
    this.salary = salary;          
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void increseSalary(Double percentage){
       this.salary = salary + salary * percentage /100;
    
    }
    public String toString(){
       return id + " , " + name +" , "+ String.format("%.2f", salary) ;
    }
}
