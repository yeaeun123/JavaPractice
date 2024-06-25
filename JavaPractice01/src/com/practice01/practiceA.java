package com.practice01;

public class practiceA {

    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index); // 전지현 -> 전**
        // for (int i = 0; i < data.length() - index; i++) {
        for (int i = index; i < data.length(); i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "전지현"; // 이름
        String id = "871231-2345678"; // 주민번호
        String phone = "010-1234-5678";// 전화번호

        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}