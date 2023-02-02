package com.aurionpro.model;

	public class Account {
		private int accountNumber;
		private String name;
		private double Balance;
		private static int count;  
		

		public Account(int accountNumber, String name, double Balance) {
			this.accountNumber = accountNumber;
			this.name = name;
			this.Balance = Balance;
			count++;
		}

		public Account(int accountNumber, String name) {
			this(accountNumber, name, 1000);
			
		}

		public Account() {
			this(1234, "Unknown", 1000);
		}

		public void setaccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public void setname(String name) {
			this.name = name;
		}

		public void setBalance(double Balance) {
			this.Balance = Balance;
		}

		public int getaccountNumber() {
			return accountNumber;
		}

		public boolean deposit(double amount) {
			if (amount > 0) {
				Balance += amount;
				return true;
			}

			return false;
		}

		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", name=" + name + ", Balance=" + Balance + "]";
		}

		public boolean withdraw(double amount) {
			if (Balance - amount > 1000) {
				Balance -= amount;
				return true;
			} else {
				return false;
			}
		}

		public String getname() {
			return name;
		}

		public double getBalance() {
			return Balance;
		}

		public static int  getAccountCount()
		{
			return count;
		}
		};


