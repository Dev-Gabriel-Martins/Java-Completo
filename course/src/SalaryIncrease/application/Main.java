
package SalaryIncrease.application;
import SalaryIncrease.entities.Payslip;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.println("How many employees will be registered? ");
      int n = sc.nextInt();
      
      
      List<Payslip> list = new ArrayList<>();
      
      
      for(int i =0; i < n;i++){
      System.out.println();
      System.out.println("Emplyooee #"+ (i+1) +":");
      System.out.print("Id:");
      Integer id = sc.nextInt();
      
      
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine(); 
      
      System.out.print("Salary: ");
      Double salary = sc.nextDouble();
      
      Payslip ps = new Payslip(id, name, salary);
      
      list.add(ps);
      }
      
      System.out.print("Enter the employee id that will have salary increase:");
      Integer idIncrease = sc.nextInt();
      Integer pos = position(list, idIncrease);
      if (pos == null){
          
      System.out.println("Does not exist this id number!");
      
      }else{
      
      System.out.println("Enter the percentage: ");    
      Double percentage = sc.nextDouble();
      list.get(pos).increseSalary(percentage);
      }
      
      System.out.println();
      System.out.println("List of employess: ");
      for(Payslip ps : list){
      
      System.out.println(ps);
      
      }
      
      
      sc.close();
  }
  
  public static Integer position(List<Payslip> list, int id){      
    
      for(int i =0 ; i < list.size(); i++){
         if(list.get(i).getId() == id){
         return i;
         } 
      
        }
      return null;
    }
  
} 
