package com.javaex.ex03;
// 강사님 풀이 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		//리스트 선언<제네릭>
	        List<Goods> goodsList = new ArrayList<>();
	       
	        Scanner sc = new Scanner(System.in);
	        
	        int countOfGoods = 0; // 입력 개수 변수
	        System.out.println("상품을 입력해주세요(종료q)");
	       
	        while(true) {
	        	 //스캐너로 상품 정보 입력
	           String line = sc.nextLine();// 한줄입력  
	         // q면 종료, 
	            if(line.equals("q")) {
	                System.out.println("[입력완료]");
	                System.out.println("===========================");
	                break;
	            }
	            
	            //아니면 콤마 기준으로 분할 Goods 객체 생성   
	            String[] data = line.split(",");
	          //상품명String, 가격 int, 개수 int
	            String name = data[0].trim(); // 공백 제거 trim 상품명
	            int price = Integer.parseInt(data[1].trim()); // wrapper클래스 이용
	            int count = Integer.parseInt(data[2].trim()); 
	            
	            // Goods 객체 생성
	            Goods goods = new Goods(name, price, count);
	            
	           // ->리스트에 추가/저장
	            goodsList.add(goods);
	        }
	        // 결과 출력 (상품 리스트 전부 출력, 상품의 개수를 집계해서 출력)
	        // 상품 리스트
	        Iterator<Goods> it = goodsList.iterator();
	        while(it.hasNext()) {
	        	Goods item = it.next();
	        	countOfGoods += item.getCount(); // 상품 개수 합산
	        	item.showInfo(); //정보 출력
	        }
	        System.out.println("모든 상품의 개수는 "+ countOfGoods + " 입니다.");
    	sc.close();
       
    }

}
