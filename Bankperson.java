import java.util.*;
class BankAccount{
    private double balance=1000;
    public void set(int amount , String type){
        if(type.equals("withdrawl")) {
           balance=balance-amount;
        }else{
            balance=balance+amount;
        }
       System.out.println("balance: "+get());
    }
    public double get(){
        return balance;
    }
    }


public class Bankperson {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,opt;
        BankAccount b=new BankAccount();

        do{
        System.out.println("Bank account");
       System.out.println("1.withdrawl\n2.Debit\n3.showBalance\n4.exit");
       System.out.print("enter the option:");
       int n=s.nextInt();
       switch(n){
        case 1:System.out.println("enter the amount to withdrawl");
               a=s.nextInt();
               b.set(a,"withdrawl");
               break;
        case 2:System.out.println("enter the amount to deposit");
               a=s.nextInt();
               b.set(a,"deposit");
               break;  
        case 3:
               System.out.println("Available amount:"+b.get());    
               break;
       case 4: System.out.println("existing!");
               System.exit(0);
        default:System.out.println("sorry! your account has been blocked");               
       }
        System.out.println("\nif you want to continue , press 1 else 0");
        opt=s.nextInt();
      } while(opt==1);
    }
}
    

