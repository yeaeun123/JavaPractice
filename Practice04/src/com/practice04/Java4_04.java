package com.practice04;

public class Java4_04 {

	public static void main(String[] args) {
		//Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요.
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		
		int count = 0; //3의 배수의 개수
		int sum = 0; //3의 배수의 합
		
		for (int i =0; i < data.length; i++) {
			if(data[i]% 3 == 0) { //3으로 나누어 떨어지면 (배수인지확인)
				count++;		//개수 증가
				sum += data[i]; //합 증가
			}
		}
		
		System.out.println("3의  배수의 개수:"+ count);
		System.out.println("3의 배수의 합:"+ sum);

	}

}
