package com.bankAccount;

import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	public double withdraw(long accountId,double balance) {
		return 0;
	}
	public double deposit(long accountId,double balance) {
		return 0;
	}
	public double getBalance(long accountId) {
		return 0;
	}
	public boolean fundTransfer(long fromaccount, long toAccount,double amount) {
		return false;
	}


}
