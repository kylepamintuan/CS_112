
public class BankAccount 
{
	private float balance;
	private float withdraw;
	private float deposit;
	
	
	public BankAccount(float balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(float withdraw)
	{
		balance = balance - withdraw;
	}
	
	public void deposit(float deposit)
	{
		balance = balance + deposit;
	}
	
	public float getBalance()
	{
		return balance;
	}
}
