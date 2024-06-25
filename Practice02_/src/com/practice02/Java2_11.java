package com.practice02;

import java.util.Scanner;

public class Java2_11 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scanner.nextInt();
		
		int large,small;
		
		if (num1 > num2) { 
			large = num1;
			small = num2;
		} else {
			large = num2;
			small = num1;
		}
		int mok = large / small;
		int namuge = large % small;{
		System.out.println("몫 : " + mok);
		System.out.println("나머지:"+namuge);
		}
		
			scanner.close();
}}
		
	


