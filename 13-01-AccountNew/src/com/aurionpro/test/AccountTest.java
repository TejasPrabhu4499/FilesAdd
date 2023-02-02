package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account(2314,"Tejas",45000);
		Account acc1=new Account(1234,"Sankalp",46700);
		Account acc2=new Account(1425,"Akshay",40000);
		
		int con=Account.getAccountCount();
		System.out.println("Total number of Accounts:"+con);
	}
}