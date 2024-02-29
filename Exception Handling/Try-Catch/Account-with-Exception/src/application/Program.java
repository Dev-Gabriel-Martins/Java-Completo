
package application;
import entities.Account;
import exceptions.BusinessException;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class Program {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account data");
        System.out.println("Number:");
        Integer number =  sc.nextInt();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Initial balance:");
        Double balance = sc.nextDouble();
        System.out.println("withdraw limit:");
        Double withdrawLimit = sc.nextDouble();
        
        Account acc = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println("Enter amount for withdraw:");
        double amount = sc.nextDouble();
        
        
		try {
			acc.withdraw(amount);
			System.out.println("New balance: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
       
    }
}
