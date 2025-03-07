import java.util.*;
class BankAccount{
    int accountNumber;
    double balance = 0;

	BankAccount(int a, int b)
    {
        this.accountNumber = a ;
        this.balance = b;
        
    }

    void withdraw(double amount){
	System.out.println("Account Number is: " + accountNumber);
	if(balance > 0){
	balance = balance - amount;
	System.out.println("Available balance is: " + balance);
	}
	else{
	System.out.println("Available balance is not sufficient");}

    }

    void deposit(double amount){
	System.out.println("Account Number is: " + accountNumber);

	if(amount > 0 && amount <=10000 ){
    	balance = balance + amount;
		System.out.println("Available balance is: " + balance);
	}
	else{
	System.out.println("Enter valid amount");}

    }
}

class atm{
	public static void main(String []args){
	// Scanner sc = new Scanner(System.in);
	
	// int balance = sc.nextInt();
	// int accountNumber = sc.nextInt();
	
	BankAccount ob = new BankAccount(1234, 10000);
	ob.withdraw(100.00);
	ob.deposit(100.00);

	}
}