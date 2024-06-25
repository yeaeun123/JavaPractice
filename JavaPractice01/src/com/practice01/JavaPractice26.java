package com.practice01;

import java.util.Scanner;

public class JavaPractice26 {

	public static void main(String[] args) {
		// 월급을 입력 받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월급을 입력하세요:");
		
		int pay = scanner.nextInt();
		
			pay = pay * 12 * 10;
			System.out.println("10년 동안 최대 저축액은 "+pay+"원 입니다.");
			scanner.close();
		}
		

		
	}


