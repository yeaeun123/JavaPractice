package com.javatest;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<>();

		userList.add(new Staff("master", "m7788", "운영자", 3500000));
		userList.add(new Customer("jung-ws", "j1357913579", "정우성", 1000));
		userList.add(new Customer("LeeHR", "a123!!", "이효리", 2500));
		userList.add(new Customer("ms-park", "y2345", "박명수", 1200));

		System.out.println("-------------회원+운영자 전체 리스트-------------");
		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			System.out.print((i + 1) + ". " + user.toString() + "\t");
			
			if(user instanceof Staff) {
				System.out.print("월급: " + Staff.getSalary());
			} else if(user instanceof Customer) {
				Customer customer = (Customer) user;
				System.out.print("포인트: "+ customer.getPoint());
			}System.out.println();
		}
		System.out.println("\n운영자의 연봉은 " + Staff.getSalary() * 12 + "입니다.");

	}
}