
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author gabri
 */
public class Program {
    public static void main(String[] args){
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        // UPcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        
        //Downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        
        //Não é possivel converter subclasse em subclasse
        // BusinessAccount acc5 = (BusinessAccount)acc3; <- ela foi intanciada como SavingsAccount

        //o intanceof, valida a instacia de um objeto
        if(acc3 instanceof BusinessAccount){
           BusinessAccount acc5 = (BusinessAccount)acc3;
           acc5.loan(100.0);
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Agora a instacia eh true");
                 
        }

        
    }
}
