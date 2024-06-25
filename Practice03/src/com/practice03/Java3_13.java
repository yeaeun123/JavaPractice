package com.practice03;

import java.util.Scanner;

public class Java3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.:");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++)
			sum += i;
		System.out.println("합계:"+ sum);
		
		scanner.close();
		


	}

}
