
package Employee.entities;

public class Employee {

    public Employee(Integer id, String name1, Double salary) {
    }
    public String name;
    public double grossSalary;
    public double tax;
 
    public void increaseSalary(double percentage){
        grossSalary = grossSalary + ((grossSalary * percentage) /100);
        
    }
    
    public double netSalary(){
        double netSalary;
        return netSalary = grossSalary - tax;
    }
    
    public String toString(){
    
    return name+", $ "+ netSalary();
    }

}
