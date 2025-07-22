package tasks;

import java.util.Scanner;
class BankAccount{
	double balance;
	BankAccount(double balance){
		this.balance=balance;
}
	   public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid amount");
	        } else if (amount>balance) {
	            System.out.println("Insufficient balance");
	        } else {
	        	balance-=amount;
	            System.out.println("Withdraw successful");
	        }
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid amount.");
	        } else {
	            balance+=amount;
	            System.out.println("Deposit successful.");
	        }
	    }

	    public double  getBalance() {
	        return balance;
	    }
}

public class Atm_Driver_class{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter intial Balance");
	        double balance=s.nextDouble();
	        BankAccount account=new BankAccount(balance);
	        while (true) {
	            System.out.println("-----ATM MENU-----");
	             System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose option: ");
	            int choice = s.nextInt();
                  switch (choice) {
	               case 1:
	               System.out.print("Enter amount to withdraw: ");
	                double withdrawAmount = s.nextDouble();
	                  account.withdraw(withdrawAmount);
	                    break;

	              case 2:
	             System.out.print("Enter amount to deposit: ");
	               double depositAmount=s.nextDouble();
	                account.deposit(depositAmount);
	                    break;

	                case 3:
	           System.out.println("current Balance: ₹" + account.getBalance());
	                break;

	                case 4:
	               System.out.println("Thank you for using the ATM. Goodbye!");
	                    s.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}
