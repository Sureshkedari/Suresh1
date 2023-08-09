package com.techzenure.java.oops;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				 if(acc == null) {
					 System.out.print("enter a/c no: ");
					 long acno = sc.nextLong();
					 sc.nextLine();
					 
					 System.out.print("enter name: ");
					 String name = sc.nextLine();
					 
					 System.out.print("enter initial deposit Rs: ");
					 float amt = sc.nextFloat();
					 
					 //-- create an instance of Account type
					 acc = new Account(acno, name, amt);
					 System.out.println("WELCOME TO STATE BANK OF INDIA--------");
				 }else
					 System.out.println("A/C IS ALREADY WITH US --- PLEASE DO ANY OTHER OPERATIONS");
				 break;
			 case 2:
				 if(acc != null) {
					 System.out.print("enter amount to deposit: ");
					 float amt = sc.nextFloat();
					 acc.deposit(amt);
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }				 
				 break;
			 case 3:
				 if(acc != null) {
					 System.out.print("enter amount to withdraw: ");
					 float amt = sc.nextFloat();
					 acc.withdraw(amt);
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }				 
				 break;
			 case 4:
				 if(acc != null) {
					acc.getBalance(); 
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }
				 break;
			 case 5:
				 System.out.println("application designed & developed by ");
			}
		}
	
	


