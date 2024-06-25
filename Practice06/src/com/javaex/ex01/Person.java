package com.javaex.ex01;

public class Person {
	//필드 =private
	private String name;
	private String hp;
	
	//생성자
	public Person() {
		System.out.println("생성자person(0) 호출");
	}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
		
	}
	//getters/setters  
	//*getter :필드의 데이터를 뽑아와서 밖으로 돌려준다
	public String getName() {
		return name;
		
	}
	//*setters :외부로부터 파라미터를 전달받아서 내부에 세팅
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void showInfo() {
		System.out.printf("%n#이름:%s,#핸드폰:%s",name,hp);
		
	}
	
	
	
}
