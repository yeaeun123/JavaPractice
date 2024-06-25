package com.practice03;

import java.util.Scanner;

public class Java3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		int sum =0 ;
		
		for(int i =1; i <=num; i++) {
			if(i % 5 == 0) {
				
			
				System.out.println("5의 배수의 개수:" +i);
			
				System.out.println("5의 배수의 합:" + sum);
		} 
			
		
			}
		scanner.close();
			}
		
		}


