package com.practice04;

import java.util.Scanner;

public class Java4_05 {

	public static void main(String[] args) {
		//5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력:");
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) { //5번째 숫자를 받을때까지 +1씩
			int num = scanner.nextInt(); //콘솔에서 숫자 입력하기
			sum += num;	//받은 숫자 다 더하기
		}
		int average = sum / 5; //평균 값 내기

		System.out.println("평균은 "+ average + "입니다.");
		
		scanner.close();
		
	}

}
