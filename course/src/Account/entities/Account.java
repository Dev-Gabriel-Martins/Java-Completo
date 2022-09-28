
package Account.entities;

/**
 *
 * @author gabs
 */
public class Account {
    
    private int id;
    private String name;
    private double account;    
    
    public Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Account(int id, String name, double initDeposit){
        this.id = id;
        this.name = name;
        deposit(initDeposit);
    }
    
    //get e set
    public int getId(){
        return id;
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void deposit(double deposit){
    
        account += deposit;
    }
    
    public void withdraw(double withdraw){
        account -= withdraw + 5.00;
    }
    
    public String toString(){
        return"Account "+id+", holder: "+name+", Balance $: "+String.format("%.2f%n", account);
    }
    

}

