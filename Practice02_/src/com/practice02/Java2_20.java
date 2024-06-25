package com.practice02;

import java.util.Scanner;

public class Java2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳:");
		char alphabet = scanner.next().charAt(0);
		
		if (alphabet>= 'a' && alphabet <='z') {
		if (alphabet =='a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o'|| alphabet == 'u') {
			System.out.println("모음입니다.");
		}else  {
			System.out.println("자음입니다.");
			}
		
		}else {
			System.out.println("소문자가 아닙니다.");
		}
		scanner.close();
		
	}
	}


