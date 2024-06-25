package com.practice02;

import java.util.Scanner;

public class JavaC {

	//05 아래와 같이 작성된 코드가 있다.
	//보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if (age > 20) {
			System.out.print("\"1번그룸\"");
	} else {
		System.out.println("\"2번그룸.\"");
	}
		sc.close();

	}

}
