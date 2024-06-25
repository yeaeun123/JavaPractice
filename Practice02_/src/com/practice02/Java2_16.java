package com.practice02;

import java.util.Scanner;

public class Java2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     
	        System.out.println("숫자를 입력해주세요. ");
	        System.out.print("숫자: ");
	        double x = scanner.nextDouble();
	        double result;
	        
	        if (x <= 0) {
	            result = x * x * x - 9 * x + 2;
	        } else {
	            result = 7 * x + 2;
	        }

	        System.out.println("계산 결과는 " + result + "입니다.");

	        scanner.close();
	    
	
	}

}
