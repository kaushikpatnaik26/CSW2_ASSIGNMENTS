package Q7;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount save = new SavingsAccount(1000,0);
		save .withdrawl(30);
		save .deposit(1000);
		
		System.out.println(save.getBalance());
		
		SavingsAccount save2 = new SavingsAccount(2500,0);
		save2.deposit(15000);
		save2.deposit(15000);
		
		System.out.println(sa.getBalance());
		System.out.println(sa2.getBalance());
	}

}
