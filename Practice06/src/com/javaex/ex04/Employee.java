package com.javaex.ex04;

public class Employee extends User{ //부모 설정
	//필드
	private int salary;
	
	//기본생성자
	public Employee() {
		
	}
	//전체생성자
	public Employee (String id, String password, String name, int salary) {
		//부모 먼저 초기화
		super(id, password, name);
		this.salary = salary;
		
	}
	//getters/setters
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void showInfo() {
		//id,password,name 직접 접근 가능한이유 user에서 protected로 선언했기 때문***
		System.out.println("#아이디:"+ id +", #패스워드:"+ password 
				+", #이름:" + name + ",월급 : "+ salary);
	}
	

	
}
