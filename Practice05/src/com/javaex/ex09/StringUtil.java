package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	String result = "";
    	for (String str : strArray) {
    		result += str;
    		
    	}
    	return result;
        
    }

}
