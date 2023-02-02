package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account[] accounts = { new Account(123, "Tejas", 6000), new Account(456, "Sankalp", 3000),
				new Account(789, "Akshay", 10000), new Account(213, "Prathamesh", 12000),
				new Account(463, "Amog", 5000) };
		for (Account x : accounts) {
			System.out.println(x);

		}
		System.out.println();
		System.out.println("Highest Balance:");
		double maxbalance = accounts[0].getBalance();
		int index=0;
		for (int i=0; i < 5; i++) {
			if (maxbalance < (accounts[i].getBalance())) {
				maxbalance = accounts[i].getBalance();
				index=i;
			}
		}
			System.out.println(accounts[index]);
			System.out.println("------------------"); 
			{
		
				System.out.println("Accounts List According to The Balance:");
					for(int i=0;i<accounts.length;i++) {
						for(int j=i+1;j<accounts.length;j++)
							if(accounts[i].getBalance()<accounts[j].getBalance())
							{
								
								Account temp=accounts[i];
							accounts[i]=accounts[j];
							accounts[j]=temp;
							}
					}
				}
			for(Account x:accounts)
				System.out.println(x);
			}
	}