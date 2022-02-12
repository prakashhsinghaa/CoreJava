package Constructors;

public class Account {
    private String accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("110",100.00,"xyz","xyz@gmail.com","xxx");
        System.out.println("Empty constructor call");
    }

    public Account(String accountNo,double balance,String customerName,String email,String phoneNumber){
        System.out.println("Account constructor with parameters called");

            this.accountNo = accountNo;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
    }

    public Account(String customerName,String email,String phoneNumber){
        this("999",1000.00,customerName,email,phoneNumber);
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
        System.out.println("Deposit of " + amount + " made.New balance is " + this.balance);
    }


    public void withdraw(int amount){
        if(amount < this.balance){
            this.balance = this.balance - amount;
            System.out.println("Amount of " + amount + " has been withdrawn from your bank account.New balance is " + this.balance);
        }else{
            System.out.println("your bank account has only " + this.balance + " amount.");
        }
    }

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    public String getAccountNo(){
        return this.accountNo;
    }

    public void setBalanceo(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;

    }


}
