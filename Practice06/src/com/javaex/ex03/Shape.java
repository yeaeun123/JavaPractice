package com.javaex.ex03;

public class Shape {
	
	public Shape() {
		fillColor =null;
		lineColor =null;
		
	}
	
	protected String fillColor;
	protected String lineColor;
	
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void showInfo() {
		System.out.printf("%s, %s%n",fillColor,lineColor);
	}
	
}

