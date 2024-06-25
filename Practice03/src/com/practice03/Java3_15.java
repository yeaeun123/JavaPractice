package com.practice03;

import java.util.Scanner;

public class Java3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.:");
		int num = scanner.nextInt();
	
		for(int i =1; i <=num; i++) {
			if(num % i == 0) {
			
				System.out.println(i+" ");
			}
		
	
		}
		scanner.close();
	}

}
