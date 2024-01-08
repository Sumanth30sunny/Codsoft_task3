import java.util.*;
class User 
{
    int card;
    int passcode;
    String name;
    int balance;
    
    public User(int card)
    {
        if (card == 1111)
        {
            this.passcode = 1234;
            this.name = "Sumanth";
            this.balance = 1000;
        }
        
        if (card == 2222)
        {
            this.passcode = 1234;
            this.name = "Vignesh";
            this.balance = 2500;
        }
        
        if (card == 3333)
        {
            this.passcode = 1234;
            this.name = "Prakash";
            this.balance = 4000;
        }
        
    }
}

public class ATM
{
    public static Scanner s = new Scanner(System.in);
    public static void deposit ( User u, int amount)
    {
        u.balance = u.balance + amount;
        System.out.println("Amount " + amount + " is sucessfully deposited into your account...");
        System.out.println("Transaction sucessful...");
        System.out.println("");
    }
    
    public static void withdraw ( User u, int amount)
    {
        if ( u.balance > amount)
        {
            u.balance = u.balance - amount;
            System.out.println("Amount " + amount + " is sucessfully withdrew from your account...");
            System.out.println("Transaction sucessful...");
            System.out.println("Please collect your cash...");
            System.out.println("");
        }
        
        else
        {
            System.out.println("Insufficient balance...");
            System.out.println("Transaction failed...");
            System.out.println("");
        }
        
    }
    
    public static void checkBalance(User u)
    {
        System.out.println("Your balance is " + u.balance);
        System.out.println("");
    }
    
    public static void process(User u)
    {
        int e;
        do {
            System.out.println("Select any option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            
            int o = s.nextInt();
            
            if (o == 1)
            {
                System.out.print("Enter the amount to deposit: ");
                int d = s.nextInt();
                deposit(u,d);
            }
            
             else if (o == 2)
            {
                System.out.print("Enter the amount to withdraw: ");
                int w = s.nextInt();
                withdraw(u,w);
            }
            
            else if (o == 3)
            {
                checkBalance(u);
            }
            
            else
            {
                break;
            }
            System.out.println("Please press '1' if you use again...");
            e = s.nextInt();
            
            }while(e == 1 );
    }
    
    public static void main (String [] args)
    {
        int a;
        do
        {
            System.out.println("***Welcom to ATM***");
            System.out.println("");
                    
            
            System.out.print("Enter your card number: ");
            int card = s.nextInt();
            
            User u = new User(card);
            System.out.print("Enter your pin: ");
            int pin = s.nextInt();
            if (u.passcode == pin)
            {
                process(u);
            }
            else
            {
                System.out.println("Incorrect Password...");
            }
            System.out.println("Press 1 if you wish to exit...");
            a = s.nextInt();
            
        }while(a != 1);
        
        
        
    }
}