package synchronize;

public class AccountMain {

	public static void main(String[] args) {
		Account acc= new Account();
		Thread user1= new Thread(acc,"ramu");
		Thread user2= new Thread(acc,"ravi");
		Thread user3= new Thread(acc,"rameshwari");
		user1.start();
		user2.start();
		user3.start();

	}

}
