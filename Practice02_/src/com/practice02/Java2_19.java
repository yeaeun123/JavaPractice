package com.practice02;

import java.util.Scanner;

public class Java2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도:");
		int birth =scanner.nextInt();
		
		int year = 2024;
		int age = year - birth;
		
		if(age < 15 || age >=65) {
			System.out.println(age + "살 무료 예방접종 대상자 입니다.");
		}else {
			System.out.println(age +"살 무료 예방접종 대상자가 아닙니다.");
				
			}
		}
		
		
		
	}


