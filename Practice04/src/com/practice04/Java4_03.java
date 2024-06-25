package com.practice04;

public class Java4_03 {

	public static void main(String[] args) {
		//[문제] Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.
	//20/6/10 출력

		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA; //A가 B를 가리키고 있음
		intB[0] = 20; //3->20으로 변경
		intB[2] = 10; //9->10으로 변경
		
		for(int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
