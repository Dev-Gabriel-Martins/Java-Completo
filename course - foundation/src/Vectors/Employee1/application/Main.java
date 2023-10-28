
package Vectors.Employee1.application;

import Vectors.Employee1.entities.Employee1;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee1> list = new ArrayList<>();
        
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        
        for (int i =0 ; i < n; i++){
        System.out.println("Emplyoee:" + (i + i) + ":");
        
        System.out.print("Id: ");
        Integer id = sc.nextInt();
        
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.print("Salary: ");
        Double salary = sc.nextDouble();
        
        Employee1 emp = new Employee1(id, name, salary);
        
        list.add(emp);
  
        }    
        
        System.out.print( "Entre the employee id that will have salary increase:");
        Integer idIncrease = sc.nextInt();
        Integer pos = position(list, idIncrease);
        if (pos == null){
            System.out.println("This id does not exist! ");
        }else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        
            System.out.println();
            System.out.println("List of employees:");
            for (Employee1 emp : list ){
            System.out.println(emp);
            }
            
        }        
        sc.close();
    }
    
    public static Integer position(List<Employee1> list, int id ){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
            return i;
            }
        }
            return null;
        }
        
    
}

