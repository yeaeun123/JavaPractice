package com.javatest;

public class Customer extends User {

	private int point;

	public Customer() {

	}

	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public void showInfo() {
		System.out.println("Customer: " + toString() + ", Point: " + point);

	}

}
