

public class BankAccount 
{
	private float balance;
	private float withdraw;
	private float deposit;
	private boolean last_withdraw_failed = false;
	
	public BankAccount(float balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(float withdraw)
	{
		if (withdraw <= balance)
		{
			balance = balance - withdraw;
			last_withdraw_failed = false;
		}
		else
		{
			last_withdraw_failed = true;
		}
	}
	
	public boolean lastWithdrawFailed()
	{
		return last_withdraw_failed;
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
