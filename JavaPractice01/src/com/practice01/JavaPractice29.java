package com.practice01;

import java.util.Scanner;

public class JavaPractice29 {

	public static void main(String[] args) {
		//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(너비, 높이 변수 double형으로 작성)

		Scanner scanner = new Scanner(System.in);
		System.out.print("너비를 입력하세요:");
		double width = scanner.nextDouble();
		System.out.print("높이를 입력하세요:");
		double hight = scanner.nextDouble();
		
		double result = width *hight;
		System.out.println("사각형의 둘레는"+result);
		
		
		
		
		
		scanner.close();
	}

}
