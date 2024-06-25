package com.javaex.ex04;
					
public class Customer extends User { //User 클래스 상속(확장)
	//필드
	private int point;
	
	//기본생성자
	public Customer() {
		
	}
	//전체생성자
	public Customer (String id, String password, String name, int point) {
		//부모 먼저 초기화 /super 호출
		super(id,password,name);
		this.point = point;
		
	}
	//getter/setters
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		//id,password,name 직접 접근 가능한이유 user에서 protected로 선언했기 때문***
		System.out.println("#아이디:"+ id +", #패스워드:"+ password 
				+", #이름:" + name + ", 포인트:" + point);
	}
	

}
