package com.practice02;

import java.util.Scanner;

public class Java2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		int age = scanner.nextInt();
		
		if (age>=19 && age < 65){
			System.out.println("1번 그룹 입니다.");
		} else {
			System.out.println("2번 그룹 입니다.");
		}
		scanner.close();
	}

}
