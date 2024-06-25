package com.javaex.ex01;

public class Customer extends Person{
	//필드
	private int cNo;
	private int point;
	//생성자
	public Customer() {
		System.out.println("customer 생성자 0 호출");
		
	}
	public Customer(String name, String hp,int cNo, int point) {
		//부모생성자 호출
		super(name,hp);
		this.cNo = cNo;
		this.point = point;
	}
	//getters/setters
	public int getCNo() {
		return cNo;
	}
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(", 고객번호: "+cNo+", 포인트점수: "+point);
				
	}
	//아래와 같이 출력도 가능
//	public void showInfo() {
//		System.out.println("이름:"+ super.getName()+",핸드폰:"+
//	super.getHp()+",고객번호:"+this.cNo +",포인트:"+this.point);
//	}
//	

	
}
