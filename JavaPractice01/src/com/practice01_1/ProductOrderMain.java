package com.practice01_1;

import java.util.ArrayList;

public class ProductOrderMain {
    public static void main(String[] args) {
        ArrayList<ProductOrder> data = new ArrayList<>();
        // 배열을 값으로 받아올건데 프로덕트 오더 클래스에 있는 생성자로 불러옴
        
        data.add(new ProductOrder("두부", 2000, 2));
        data.add(new ProductOrder("김치", 5000, 1));
        data.add(new ProductOrder("콜라", 1500, 2));
        //data 라는 배열에 ProductOrder에 선언한 
        //생성자를 불러와서 그 안에 맞는 값을 넣어 add로 추가할거야 

        int totalPrice = 0;

        for (ProductOrder product : data){
            product.showInfo();
            totalPrice += product.getPrice();
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}