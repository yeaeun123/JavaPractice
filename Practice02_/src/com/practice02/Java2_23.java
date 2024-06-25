package com.practice02;

import java.util.Scanner;

public class Java2_23 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	   
	        System.out.println("태어난 년도를 입력해주세요.");
	        System.out.print("년도: ");
	        int birthYear = scanner.nextInt(); 
	        int currentYear = 2024;
	        System.out.println("올해: " + currentYear);
	        int age = currentYear - birthYear;
	        System.out.println("나이: "+ age);
	        
	        if (age < 20) {
	           System.out.println("========================");
	            System.out.println("20살 미만 건강검진 대상이 아님");
	            }
	            
	            else {
	                System.out.println("========================");
	                System.out.println("20살 이상");
	                if (currentYear % 2 == 0 && birthYear % 2 == 0) {
	                    System.out.println("건강검진 해");
	                } else {
	                    System.out.println("건강검진해 아님");
	                }

	                if (age >= 40) {
	                    System.out.println("암 검사");
	                } else {
	                    System.out.println("암 검사 x");
	                }
	            }

	            scanner.close();
	        }
	    }