package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account(" ","Tejas",45000);
		Account acc1=new Account("","Sankalp");
		Account acc2=new Account();
		
		System.out.println(acc);
		System.out.println(acc1);
		System.out.println(acc2);
	}
}