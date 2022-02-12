package Constructors;

public class VipCustomer {
    private String name;
    private double CreditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("ram",10000,"ram@gmail.com");
    }

    public VipCustomer(String name,double CreditLimit) {
        this(name,CreditLimit,"xyz@gmail.com");
    }

    public VipCustomer(String name,double CreditLimit,String emailAddress){
            this.name = name;
            this.CreditLimit = CreditLimit;
            this.emailAddress = emailAddress;
        }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



}
