import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		
		//ArrayList<AccountInfo> accounts = new ArrayList<AccountInfo>();
		
		Accounts accounts = new Accounts();
		
		Scanner sc = new Scanner(System.in);
		String choice1 = "y";
		
		System.out.println("Welcome to Evil Corp Saving and Loan");
		System.out.println("Please create the user account(s)");
		
		while(choice1.equalsIgnoreCase("y"))
		{
			
				
				System.out.print("Enter an account # or -1 to stop entering accounts : ");
				int accno = sc.nextInt();
				if(accno == -1)
				{
					break;
				}
				System.out.print("Enter the name for acct # " + accno + " : ");
				String name = sc.next();
				System.out.print("Enter the balance for acct " + accno + " : ");
				double balance = sc.nextDouble();
				
				AccountInfo acc = new AccountInfo();
				acc.setAccNo(accno);
				acc.setName(name);
				acc.setBalance(balance);
				
				accounts.addAccount(acc);
				
				System.out.println();
				
			
		}
		
		System.out.println();
		
		AccountInfo curr = null;
		int acc_num = 0;
		String choice2 = "y";
		
		while(choice2.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a transaction type (Check (C), Debit card(DC), Deposit(D) or Withdrawal(W)) or -1 to finish : ");
			String des = sc.next();
			if(des.equalsIgnoreCase("-1"))
			{
				break;
			}
			
			System.out.print("Enter the account # : ");
			acc_num = sc.nextInt();
			curr = accounts.getAccount(acc_num);
			if(curr == null)
			{
				System.out.println("no such accout exists! Exiting program");
				break;
			}
			
			
			if(des.equalsIgnoreCase("C"))
			{
				System.out.print("Enter the amount of the check : ");
				double amount = sc.nextDouble();
				System.out.print("Enter year of check : ");
				int year = sc.nextInt();
				System.out.print("Enter the month of the check : ");
				int month = sc.nextInt();
				System.out.print("Enter the day of the check : ");
				int day = sc.nextInt();
				
				System.out.println();
				
				Check check = new Check(year, month, day, amount);
				curr.check_remove(check);
			}
			
			else if(des.equalsIgnoreCase("DC"))
			{
				System.out.print("Enter the amount for debit card : ");
				double debit = sc.nextDouble();
				curr.remove(debit);
			}
			
			else if(des.equalsIgnoreCase("D"))
			{
				System.out.print("Enter amount to be deposited : ");
				double deposit = sc.nextDouble();
				curr.dep(deposit);
			}
			
			else if(des.equalsIgnoreCase("W"))
			{
				System.out.print("Enter amount to be withdrawn : ");
				double withdrawn = sc.nextDouble();
				curr.remove(withdrawn);
			}
			
			
		}
		
		if(curr != null)
		{
			double curr_balance = curr.getBalance();
			System.out.println("The balance for the account " + acc_num + " is " + curr_balance);
		}	
	}
}	



//Used for testing purposes
	/*
	 * 
	 * Check ch = new Check(2005,11, 20, 2);
			Check ch2 = new Check(2004,10, 14, 4);
			Check ch3 = new Check(2002,9, 22, 5);
			Check ch4 = new Check(2010,4, 10, 10);
			
			checks.add(ch);
			checks.add(ch3);
			checks.add(ch4);
			checks.add(ch2);
			
			
			
			 Collections.sort(checks, new MyCompare());
			 System.out.println("Sorted list entries: ");
		        for(Check c:checks)
		        {
		        	System.out.println(c.getAmount());
		        }
	
	
	
	
	class MyCompare implements Comparator<Check>{
		 
	    @Override
	    public int compare(Check c1, Check c2) {
	        if(c1.getTime() < c2.getTime()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	
	}
	
*/	
