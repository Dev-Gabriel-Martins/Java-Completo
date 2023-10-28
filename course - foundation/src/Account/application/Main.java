
package Account.application;

import Account.entities.Account;
import java.util.Locale;
import java.util.Scanner;
/**
 * @author gabs
 */

public class Main {
   public static void main(String[] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);       
       Account acc;
        
       System.out.print("Entrer accout number: ");
       int id = sc.nextInt();

       sc.nextLine();
       System.out.print("Enter accout holder: ");
       String name = sc.nextLine();
     
  
       
       System.out.print("is there na initial deposit value (y/n) ");
       char answer = sc.next().charAt(0);
       
       if(answer == 'y'){
           System.out.print("Enter initial deposit value: ");
           double initDeposit = sc.nextDouble();
          acc = new Account(id, name,initDeposit);
       }else{
           acc = new Account(id, name);
       }
       
       
       
       System.out.println();
       System.out.println("Accout data:");
       System.out.println(acc);
     
       
       System.out.print("Enter a deposit value: ");
       double deposit = sc.nextDouble();
       acc.deposit(deposit);
       
       
       System.out.println("Upadate accout data:");
       System.out.println(acc);
      
      
       System.out.print("Enter a withdraw value: ");
       double withdraw = sc.nextDouble();
       acc.withdraw(withdraw);
       
       System.out.println("Upadate accout data:");
       System.out.println(acc);
              
       
   } 
}
