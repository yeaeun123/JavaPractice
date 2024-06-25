package com.practice02;

import java.util.Scanner;

public class Java2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("키와 몸무게를 입력해 주세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키: ");
		double hei = scanner.nextDouble();
		System.out.println("몸무게");
		double wei = scanner.nextDouble();
		double bmi = wei / hei;
		
		
		if (bmi < 18.5) {
			System.out.println("저체중입니다.");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("정상체중입니다.");
		} else {
			System.out.println("과체중입니다.");
		}
		System.out.println(bmi);
		scanner.close();
		
	}

}
