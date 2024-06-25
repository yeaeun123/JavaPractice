package com.javaex.ex01;

public class Member {

	public Member() {
		
	}

	private String id;
	private String name;
	private int point;
	
	public Member(String name,String id,int point) {
		this.id = id;
		this.name = name;
		this.point = point;
		
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s),%d 점%n"
				,name,id,point);
		
	}

}
