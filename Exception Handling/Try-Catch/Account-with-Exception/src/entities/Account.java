package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account(){}
    
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
     this.number = number;
     this.holder = holder;
     this.balance = balance;
     this.withdrawLimit = withdrawLimit;        
    }
    
    public void deposit(Double amount){
    
    }
    
    public void withdraw(Double amount){
    
    }









}
    