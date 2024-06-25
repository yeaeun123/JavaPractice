package com.practice02;

import java.util.Scanner;

public class Java2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.println("숫자1:");
		int num1 = scanner.nextInt();
		System.out.println("숫자2:");
		int num2 = scanner.nextInt();
		System.out.println("숫자3:");
		int num3 = scanner.nextInt();
	
		int small = num1; //num1이 제일 작다고 가정했을떄
		
		if (num2 < small) { //num2가 small보다 작으면
			small = num2;	//num2가 small로 지정됨
		
	}	if (num3 < small){
			small = num3;
	}	System.out.println("가장 작은 수는 "+small + "입니다.");

	
	
		scanner.close();
	}}
		
	


