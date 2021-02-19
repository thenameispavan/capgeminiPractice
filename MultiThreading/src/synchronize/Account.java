package synchronize;

public class Account implements Runnable {
double balance=10000;
public synchronized void withDraw(double amount, String name) {
	if(amount<balance) {
		System.out.println(name+" is trying to withdraw:");
		balance-=amount;
		System.out.println(name+"'s current balance is: "+balance);
	}
	else {
		System.out.println("insufficient funds: ");
	}
}
@Override
public void run() {
	withDraw(4000,Thread.currentThread().getName());
	
}
}
