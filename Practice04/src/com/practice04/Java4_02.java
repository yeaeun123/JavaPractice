package com.practice04;

public class Java4_02 {

	public static void main(String[] args) {
		
		double[] doubleArray = new double[3];
		
		doubleArray[0] = 6.7;
		doubleArray[1] = 3.3;
		doubleArray[2] = 1.2;
		
		for(int i = 0; i < doubleArray.length; i++) { //배열의 인덱스는 정수형이어야함 / double->int로 변경
			System.out.println(doubleArray[i]);
			
		}

	}

}
