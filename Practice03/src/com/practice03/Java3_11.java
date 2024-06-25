package com.practice03;

import java.util.Scanner;

public class Java3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		
		int sum = 0;
		if(num %2 ==0) {
			for(int i =2; i <= num; i+=2) {
				sum += i;
			}
		}else {
			for (int i = 1; i <=num; i +=2) {
				sum +=i;
			}
		}
		System.out.println("결과값:"+sum);
		
		scanner.close();
	}
	

}
