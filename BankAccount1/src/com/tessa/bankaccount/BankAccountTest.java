package com.tessa.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		BankAccount user2 = new BankAccount();
		BankAccount user3 = new BankAccount();
		user1.makeDeposit("checking", 300.00);
		user1.makeDeposit("Savings", 200.00);
		user2.makeDeposit("checking", 800.00);
		user2.makeDeposit("Savings", 400.00);
		user3.makeDeposit("checking", 1350.00);
		user3.makeDeposit("Savings", 1550.00);
		
		user3.withdrawMoney("checking", 200.00);
		user2.withdrawMoney("checking", 100.00);
		user1.withdrawMoney("checking", 20.00);
		
		user1.checkTotal();


	}

}
