package com.javaex.ex05;

public class Depart extends Employee {

	 //필드
	private String depart; 	//부서정보 필드
	
	//기본생성자
	public Depart() {
		
	}
	//전체 생성자(매개변수 생성자)/name,salary,depart
	public Depart (String name, int salary, String depart) {
		//부모 먼저 초기화
		super(name,salary);
		this.depart = depart;
	}
	//getters/setters
	public String getPart() {
		return depart;
	}
	public void setPart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public void showInformation() {
		System.out.println("이름:" + super.getName() +
				" 연봉:" + super.getSalary() + "부서:"+ depart); //depart의 showinfo
		super.showInformation(); //employee의 showinfo
		
	}
	

}
