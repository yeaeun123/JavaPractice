package com.practice02;

import java.util.Scanner;

public class Java2_15 {

	public static void main(String[] args) {

		System.out.println("출력되는 내용을 입력하세요.");
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("기호: ");
	        char cal = scanner.next().charAt(0); 
	        System.out.print("숫자1: ");
	        double num1 = scanner.nextDouble(); 
	        System.out.print("숫자2: ");
	        double num2 = scanner.nextDouble(); 

	        double result;
	        switch (cal) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("결과: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("결과: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("결과: " + result);
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("계산할 수 없습니다.");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("결과: " + result);
	                }
	                break;
	            default:
	                System.out.println("계산할 수 없는 기호입니다.");
	        }

	        scanner.close();
	    
	}

}
