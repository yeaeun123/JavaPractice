package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//스캐너 입력후  split으로 분할 
public class FriendApp {

	public static void main(String[] args) {
		// 스캐너 친구정보 입력
		// 이름 핸드폰 학교 -> ' '으로 구분된 데이터
		// 3명 입력 , ArrayList에 담기
		List<Friend> friendList = new ArrayList<Friend>(); // import

		Scanner scanner = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");

		for (int i = 0; i < 3; i++) {
			String line = scanner.nextLine(); // nextLine 한줄입력
			String[] data = line.split(" "); // 공백으로 분할

			// Friend 객체 생성
			Friend friend = new Friend(data[0], data[1], data[2]);
			// 리스트에 추가
			friendList.add(friend);

		}
		// 친구 정보 출력 =>Iterator 쓰는거 연습하기
		Iterator<Friend> it = friendList.iterator();
		while(it.hasNext()) {
			Friend item = it.next();
			item.showInfo();
		}

		scanner.close();
	}

}
