package com.javaex.ex03;

public class Goods {
	//필드
	private String name;
	private int price;
	private int count;

	public Goods() {
		
	}
	//생성자
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public void showInfo() {
		System.out.println(name + "(가격:"+ price +"원)이 "+count +"개 입고 되었습니다.");
		
	}

	


}
