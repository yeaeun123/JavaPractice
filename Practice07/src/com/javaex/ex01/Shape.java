package com.javaex.ex01;
//추상클래스 
//abstract 객체화 불가
public abstract class Shape {
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
}


