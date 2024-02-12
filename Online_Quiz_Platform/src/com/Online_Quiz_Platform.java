package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Online_Quiz_Platform {

	static double account_Number=2005210;
	String account_Holder_Name;
	double identity_No;
	double balance=0;
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	public Online_Quiz_Platform() {
		
	}
	public Online_Quiz_Platform (String account_Holder_Name, double identity_No, double balance) {
		super();
		this.account_Holder_Name = account_Holder_Name;
		this.identity_No = identity_No;
		this.balance = balance;
		account_Number=account_Number+2;
	}
	void widthdraw() throws NumberFormatException, IOException{
		System.out.println("Enter Amoount...");
		double amount=Double.parseDouble(b.readLine());
		try {
			if(amount>balance || balance<0) {
				System.out.println("Insufficient Balance...");
			}
			else {
				balance=balance-amount;
				System.out.println("Successfully amount widthdraw...");
				System.out.println("Remaining Balance: "+balance);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	void deposit() throws NumberFormatException, IOException{
		System.out.println("Enter Amount...");
		double amount=Double.parseDouble(b.readLine());
		balance=balance+amount;
		System.out.println("Successfully Amount Deposited...");
		System.out.println("Total Balance: "+balance);
	}
	void checkBalance() {
		System.out.println("Your Balance:"+balance);
	}
	void AccountInfo() {
		System.out.println("\n Account Number: "+account_Number+"\n Account_Holder_Name: "+account_Holder_Name);
	}
	
	void exitApplication() {
		System.out.println("Thank You for Banking with Us...");
		System.exit(1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("___Welcome to Banking Application___");
		System.out.println("Enter Your Identity Number...");
		double identity_No=Double.parseDouble(b.readLine());
		System.out.println("Enter Your Name...");
		String account_Holder_Name=b.readLine();
		System.out.println("Enter Deposite Amount...");
		double balance=Double.parseDouble(b.readLine());
		Online_Quiz_Platform  ba=new Online_Quiz_Platform (account_Holder_Name,identity_No,balance);
		
		
		do {
			System.out.println("\n1.Account Information \n2.Deposit Amount \n3.Widthdraw \n4.Check Balance \n5.exit");
			System.out.println("Enter Choice...");
			int choice=Integer.parseInt(b.readLine());
			if(choice == 0 || choice>5) {
				System.out.println("Please Enter Valid Choice...");
			}
			else {
			switch(choice) {
			case 1: ba.AccountInfo();
			break;
			case 2: ba.deposit();
			break;
			case 3: ba.widthdraw();
			break;
			case 4: ba.checkBalance();
			break;
			case 5: ba.exitApplication();
			break;
			}
			}
			
		}while(true);
	}

}
