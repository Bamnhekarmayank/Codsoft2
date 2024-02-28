package Codsoft;
// ATM interface
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double bal =1000;
        double wd;
        double dep;
        System.out.println("Enter the pin :");
        int pin= s.nextInt();
        if (pin==2300 ){
            System.out.println("Account Number : 2566544120");
            System.out.println("Welcome");
            System.out.println("Please enter the option according to your choice :");
            System.out.println("1.Check Balance\n 2.Withdrawn Cash\n 3.Deposit\n 4.Exit");
            int choice =s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your current balance amount is:\n"+ bal);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn :");
                    wd=s.nextDouble();
                    if (bal>=wd){
                        bal=bal-wd;
                        System.out.println("Please collect your amount :\n"+wd);
                        System.out.println("Remaining amount in your account :\n"+bal);
                    }else {
                        System.out.println("Insufficient amount in your account !");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposit :");
                    dep=s.nextDouble();
                    bal=bal+dep;
                    System.out.println("Updated amount in your account : \n"+bal);
                    break;
                case 4:
                    System.out.println("Thanks for visiting... ");
                    break;
            }
        }else{
            System.out.println("Access Denied");
            System.out.println("Please retry with correct pin");
        }

    }
}
