

public class BankAccount 
{
	private float balance;
	private float withdraw;
	private float deposit;
	private boolean last_withdraw_failed = false;
	private int counter = 0;
	private boolean is_closed = false;
	
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
			counter++;
		}
	}
	
	public boolean lastWithdrawFailed()
	{
		return last_withdraw_failed;
	}
	
	public boolean isClosed()
	{
		if (counter >= 3)
		{
			is_closed = true;
		}
		return is_closed;
	}
	
	public void deposit(float deposit)
	{
		balance = balance + deposit;
	}
	
	public float getBalance()
	{
		if(is_closed == true)
		{
			return 0;
		}
		else
		{
			return balance;
		}
	}
}
