package com.tessa.bankaccount;

public class BankAccount {
	
	//member variable
	private double checkingBalance = 0.00;
	private double savingsBalance = 0.00;
	private static int numOfAccountsCreated = 0;
	private static double totalAmount = 0.00;
	
	//constructor 

	public BankAccount() {
		checkingBalance = 0.0;
		savingsBalance = 0.0;
		numOfAccountsCreated++;
	}
	
	//getter
	
	public double getUsersCheckingBalance() {
		return checkingBalance;
	}
	
	public double getUsersSavingsBalance() {
		return savingsBalance;
	}
	
	//setter
	
	public void setUsersCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	
	public void setUsersSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	//methods
	
	public void makeDeposit(String accountType, double amount) {
		if(accountType == "checking") {
			this.checkingBalance += amount;
			totalAmount += amount;
			System.out.println("+$" + amount);
		}
		else if(accountType == "Savings") {
			savingsBalance += amount;
			totalAmount += amount;
			System.out.println("+$" + this.savingsBalance);
		}
		else {
			System.out.println("You must choose to withdraw an amount in either Checking or Savings");
		}
		
	}
	
	public void withdrawMoney(String accountType, double amount) {
		if(accountType == "Checking") {
			if(amount > checkingBalance) {
				System.out.println("insufficient funds, cannot withdraw from Checking.");
			}
			else {
				this.checkingBalance -= amount;
				totalAmount -= amount;
				System.out.println("Succesfully withdrawn amount from Checking Account.");
			}
		}
		if(accountType == "Savings") {
			if(amount > savingsBalance) {
				System.out.println("Insufficient Funds, cannot withdraw from Savings Account.");
			}
		}
		else {
			this.savingsBalance -= amount;
			totalAmount -= amount;
			System.out.println("Succesfully withdrawn amount from Savings Account.");
		}
		
	}
	
	public void checkTotal() {
		System.out.println("Your Checking balance is: " + checkingBalance + ", & Your Savings Balance is: " + savingsBalance);
	}
	
	
	
	
}
