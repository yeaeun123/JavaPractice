package com.practice03;

import java.util.Scanner;

public class Java3_14 {
	//잘모르겠어요

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.:");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum +=i;
			System.out.print(i);
			if(i < n) {
				System.out.print("+");
			}
			
		}

			System.out.println();
		
		System.out.println("합계:"+ sum);
		
		scanner.close();
		

	}

}