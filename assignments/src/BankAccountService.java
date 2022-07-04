package com.bankAccount;

import org.springframework.stereotype.Service;

@Service
public interface BankAccountService {
	
	public double withdraw(long accountId,double balance);
	public double deposit(long accountId,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromaccount, long toAccount,double amount);

}
