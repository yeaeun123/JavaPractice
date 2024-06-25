package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;

		System.out.println(p1 == p2); // == 는 참조주소 비교이므로 false
		System.out.println(p2 == p3); // == 는 참조주소 비교이므로 false
		System.out.println(p3 == p4); // == 는 참조주소 비교이므로 false
		System.out.println(p4 == p1); // p4는 p1의 참조 주소 값이 들어가므로true
		System.out.println(p1.equals(p2));
		// equals메소드가 오버라이딩 되지 않아서 object 클래스의
		// equals메소드 호출되어 참조주소 비교함! 따라서 false
		System.out.println(p4.equals(p1)); //true
		
	}

}
