package com.practice02;

import java.util.Scanner;

public class Java2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳:");
		
		char alphabet = scanner.next().charAt(0);
		
		switch(alphabet) {
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("모음입니다.");
		break;
		default:
			System.out.println("자음입니다.");
			break;
		}
		
		scanner.close();
		
	}

}
