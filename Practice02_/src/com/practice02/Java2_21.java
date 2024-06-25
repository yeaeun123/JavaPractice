package com.practice02;

import java.util.Scanner;

public class Java2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번:");
		int sabun = scanner.nextInt();
		
		if (sabun <=0) {
			System.out.println("잘못된 사번입니다.");
		} else {
			int teamNo =sabun % 3;
			
		String team;
		if(teamNo ==0) {
			System.out.println("A팀입니다.");
		}else if (teamNo == 1) {
			System.out.println("B팀입니다.");
		} else {
			System.out.println("C팀입니다.");

		}
		}
		
	scanner.close();
	}}


