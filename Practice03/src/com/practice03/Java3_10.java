package com.practice03;

import java.util.Scanner;

public class Java3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int max;
		System.out.println("숫자를 입력하세요.");
		System.out.println("숫자 : ");
		int num1 = scanner.nextInt();
		System.out.println("숫자 : ");
		int num2 = scanner.nextInt();
		System.out.println("숫자 : ");
		int num3 = scanner.nextInt();
		System.out.println("숫자 : ");
		int num4 = scanner.nextInt();
		System.out.println("숫자 : ");
		int num5 = scanner.nextInt();
		
		max = num1;
		
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 > max) {
            max = num5;
        }
		System.out.println("가장 큰 수는 "+ max + "입니다.");
		
		scanner.close();
		

	}

}
