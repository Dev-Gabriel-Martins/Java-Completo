
package Account.entities;

/**
 *
 * @author gabs
 */
public class Account {
    
    private int id;
    private String name;
    private double account;    
    
    //get e set
    public int getId(){
        return id;
    }
    
    public void newId(int id){
        this.id = id;
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
        account = account - withdraw - 5.00;
    }
    
    public String toString(){
        return"Account "+id+", holder: "+name+", Balance: "+String.format("%.2f%n", account);
    }
    

}

