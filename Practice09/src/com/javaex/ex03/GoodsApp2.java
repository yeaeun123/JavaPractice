package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp2 {

	public static void main(String[] args) {
		//리스트 선언<제네릭>
	        List<Goods> goodsList = new ArrayList<>();
	    //스캐너로 상품 정보 입력    
	        Scanner sc = new Scanner(System.in);
	        
	    // q면 종료, 아니면 콤마 기준으로 분할 Goods 객체 생성->리스트에 저장
	        System.out.println("상품을 입력해주세요(종료q)");
	        String user;
	        while(true) {
	            user = sc.nextLine();
	            if(user.equals("q")) {
	                System.out.println("[입력완료]");
	                break;
	            }
	            
	            String[] data = user.split(",");
	            String name = data[0];
	            int price = Integer.parseInt(data[1]);
	            int count = Integer.parseInt(data[2]);
	            
	            Goods goods = new Goods();
	            goodsList.add(goods);
	        }
	        // 결과 출력 (상품 리스트 전부 출력)
	        System.out.println("==========================");
	        System.out.println("등록된 상품 리스트:");
	        
	        Iterator<Goods> it = goodsList.iterator();
	        while(it.hasNext()) {
	            Goods item = it.next();
	            item.showInfo();
	        }
    	sc.close();
       
    }

}
