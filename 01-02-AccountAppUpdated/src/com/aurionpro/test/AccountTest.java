package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
	//	printAccountDetails(account);
		withdraw(account,1000);
		deposit(account,5000);
		

	}

	private static void deposit(Account account, int amount) {
		if(account.deposit(amount)) {
			printline();
			System.out.println("Deposited Succesfully in account:"+account.getaccountNumber());
			System.out.println("Current Balance"+account.getBalance());
		}
		else {
			System.out.println("Transaction Failed");
		}
	}

	private static void printline() {
System.out.println("------------------------------------------------------");		
	}

	private static void withdraw(Account account, int amount) {
		if(account.withdraw(amount)) {
			System.out.println("Withdrawal Succesfull for Account Number :"+account.getaccountNumber());
			System.out.println("Current Balance :"+account.getBalance());
			}
			else {
				System.out.println("Invalid");
			}
		}

	private static void printAccountDetails(Account account) {
		System.out.println(account.getBalance());
		System.out.println(account.getaccountNumber());
		System.out.println(account.getname());
		}

}
