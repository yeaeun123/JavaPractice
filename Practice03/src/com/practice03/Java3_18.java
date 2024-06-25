package com.practice03;

import java.util.Scanner;

public class Java3_18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
	
	
		   // 별표 개수 줄이기
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 별표 개수 늘리기
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
			
			
		System.out.println();
	
		
	        }
		scanner.close();
	
	}}

