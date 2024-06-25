package com.javaex.ex04;

public class Base {
	private String day;
	private String night;
	private String afternoon;
	
	
    public Base() {
    	
    }
    public Base(String day, String night, String afternoon) {
    	this.day = day;
    	this.night = night;
    	this.afternoon = afternoon;
    }
    public void service(String state) {
        if("낮".equals(state)) {
            day();
        } else if("밤".equals(state)) {
            night();
        } else if("오후".equals(state)) {
            afternoon();
        }
    }

 
    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        System.out.println("밤에는 숙면");
    }
    
    public void afternoon() {
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
    
}

   
