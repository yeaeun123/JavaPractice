package com.practice02;

import java.util.Scanner;

public class Java2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요.");
		System.out.print("금익:");
		int money = scanner.nextInt(); // 금액 입력하는 곳 만들기
		
		double tax; //세금 변수 선언
		if(money>0 && money <= 1000) {
			tax = 0.09 * money; //1000이하인 경우 계산법 입력
			System.out.println("소득세는"+ tax +"입니다.");
		}else if (money>0 &&money <=4000) {
			tax = 1000 * 0.09 + 0.18 * (money-1000);
			System.out.println("소득세는"+ tax +"입니다.");
		}else if (money >0 && money < 8000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27 * (money-4000);
			System.out.println("소득세는"+ tax +"입니다.");
		}else if (money>0&& money >= 8000){
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36 * (money-8000);
			System.out.println("소득세는"+ tax +"입니다.");
		}else{	
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
		scanner.close();
		}

	}


