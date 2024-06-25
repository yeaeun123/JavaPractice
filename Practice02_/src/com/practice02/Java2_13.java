package com.practice02;

import java.util.Scanner;
//두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요
//0은 입력하지 않습니다
public class Java2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int b = scanner.nextInt();
		
		int large;
		int small;
		
		if (a > b) {
			small = b;
			large = a;
		}else {
			small = a;
			large = b;
			
		}
		if (small !=0 && large % small == 0) {
			System.out.println(small + "는"+ large+ "의 약수입니다.");
		}else {
			System.out.println(large + "는"+ small +"의 약수가 아닙니다.");
		}
		
		scanner.close();
	
	}
}
