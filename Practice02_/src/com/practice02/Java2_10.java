package com.practice02;

import java.util.Scanner;

public class Java2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.println("숫자1:");
		int num1 = scanner.nextInt();
		System.out.println("숫자2:");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수 :" + num1 + "작은수 : " + num2);
		} else {
			System.out.println("큰수 : "+ num2 + " 작은수 : " + num1);
			
			
		}
		scanner.close();
	}

}
