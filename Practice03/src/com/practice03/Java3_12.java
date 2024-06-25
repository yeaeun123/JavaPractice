package com.practice03;

import java.util.Scanner;

public class Java3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		int fac =1;
		for (int i =num; i>0; i--) {
			fac = fac*i;}
		{System.out.println( "결과값:" +fac);
		}

		
		scanner.close();
	}
}


