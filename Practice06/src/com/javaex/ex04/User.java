package com.javaex.ex04;

public class User {
	//필드 (protected는 자식객체에서 바로 접근 가능)
	protected String id;
	protected String password;
	protected String name;
	
	//기본 생성자
	public User() {
		
	}
	//전체 필드 생성자
	public User(String id, String password, String name) {
		this.id = id;
		this.password =password;
		this.name = name;
	}
	//getters/setters
	//getter :필드의 데이터를 뽑아와서 밖으로 돌려준다. 외부로 반환 return
	//setters :외부로부터 파라미터를 전달받아서 내부필드에 세팅/this
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("#아이디:"+id +", #패스워드:"+ password +", #이름:"+name);
	}
	
}
