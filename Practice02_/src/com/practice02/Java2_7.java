package com.practice02;

import java.util.Scanner;

public class Java2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 0 && age <= 7) {
			
			System.out.println("취학 전 아동/무료입니다.");
		} else if (age >= 8 && age <=13) {
			System.out.println("초등학생 / 2000원 입니다.");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생 / 3000원 입니다.");
		} else if (age >= 17 && age <=19) {
			System.out.println("고등학생/ 4000원 입니다.");
		} else {
			System.out.println("성인 / 5000원 입니다.");
		}
			
		sc.close();
			
		}
	}


