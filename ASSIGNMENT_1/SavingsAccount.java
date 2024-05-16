package Q7;

public class SavingsAccount extends Account{
	
	final double interestRate=12.66;
	
	public SavingsAccount(int accountNo, double balance) {
		super(accountNo,balance);
	}
	
	@Override
	public void deposit(double amount) {
		setBalance(amount+getBalance());
		System.out.println("The Interest amount is:"+0.12*amount);
	}
	
	@Override
	public void withdrawl(double amount) {
		if(amount>getBalance()) {
			System.out.println("The balance is insufficient.");
		}else {
			setBalance(getBalance()-amount);
		}
	}

}
