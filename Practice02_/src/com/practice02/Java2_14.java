package com.practice02;

import java.util.Scanner;

public class Java2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번을 입력해 주세요.");
		System.out.print("사번 : ");
		int sab = scanner.nextInt();
		
		if (sab > 0) {
			int team = sab % 3;
			String teamNo;
			
			switch (team) {
				case 0:
				teamNo = "A팀";
				break;
				case 1: 
				teamNo = "B팀";
				break;
				case 2: 
				teamNo = "C팀";
				break;
				default : 
				teamNo = " 팀 미정";
				break;
			}
			System.out.println(teamNo+"입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
			scanner.close();
		
	}

}
