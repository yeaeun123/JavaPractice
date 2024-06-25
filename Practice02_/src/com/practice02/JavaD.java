package com.practice02;

import java.util.Scanner;

public class JavaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if (19 >= age && age < 65) {
			System.out.print("\"1번그룸\"");
	} else {
		System.out.println("\"2번그룸.\"");
	}
		sc.close();

		}

	

	}


