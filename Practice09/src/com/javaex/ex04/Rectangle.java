package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	//extends로 (shape)상속받고 implements로 (Resizeable)구현한다.
	
	//필드
	private double width;
	private double height;

	//생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}


}
