package Constructors;

public class Main {
    public static void main(String[] args) {
       //Account prakash = new Account();
       //initializing values using constructor
       Account prakash = new Account();//"1123",0.00,"prakash singh","prakash@gmail.com","7083077729");
       System.out.println(prakash.getAccountNo());
       System.out.println(prakash.getBalance());
       //       prakash.setAccountNo("1123");
//       prakash.setBalanceo(0.00);
//       prakash.setCustomerName("prakash singh");
//       prakash.setEmail("prakashsingha1098@gmail.com");
//       prakash.setPhoneNumber("7083077729");

       prakash.withdraw(100);
       prakash.deposit(50);
       prakash.withdraw(100);

       prakash.deposit(51);
       prakash.withdraw(100);

       Account Vari = new Account("Veere","ver@gmail.com","7936767678");
       System.out.println("Account Number :" + Vari.getAccountNo() + " Name : " + Vari.getCustomerName());


       System.out.println("*********************************************");

       VipCustomer person1 =new VipCustomer();
       System.out.println(person1.getName());

       VipCustomer person2 = new VipCustomer("shyam",1000);
       System.out.println(person2.getName());

       VipCustomer person3 = new VipCustomer("vyam",2000,"vyam@gmail.com");
       System.out.println(person3.getName());
       System.out.println(person3.getEmailAddress());
    }
}
