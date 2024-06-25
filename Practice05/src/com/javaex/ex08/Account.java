package com.javaex.ex08;

public class Account {
	private String accountNo;
	private int balance;
  
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족하거나 유효하지 않은 금액입니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
		
	}
    

