package mulitiTherading;
import java.util.Scanner;
class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance=initialBalance;
	}
	public synchronized void deposit(double amount) {
		System.out.println("Depositing :"+amount);
		balance+=amount;
		System.out.println("new balance after deposit :"+balance);
	}
	public synchronized void withdrawal(double amount) {
		if(balance >= amount) {
			System.out.println("withdwaing after amount :"+amount);
			balance -= amount;
			System.out.println("new balance after withdrawal :"+balance);
		}
		else {
			System.out.println("insuffient balance try again later .....");
		}
	}
}
class Transcation implements Runnable{
	private BankAccount account;
	private boolean deposit;
	private double amount;
	public Transcation(BankAccount account,boolean deposit,double amount) {
		this.account=account;
		this.deposit=deposit;
		this.amount=amount;
	}
	public void run() {
		if(deposit) {
			account.deposit(amount);
			
		}
		else {
			account.withdrawal(amount);
			
		}
	}
}
public class TestSynchronization {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);	
		Thread thread1=new Thread(new Transcation(account,true,500),"Deposit");
		Thread thread2 = new Thread (new Transcation(account ,false,2200),"withdrawal");
		Thread thread3 = new Thread (new Transcation(account ,true,300),"deposit");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
