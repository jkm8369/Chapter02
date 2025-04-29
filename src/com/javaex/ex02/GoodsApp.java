package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		// 이름 저장
		camera.setName("니콘");
		
		//이름 읽어오기
		 String name = camera.getName();
		 System.out.println(name);
		
		// 가격 저장
		 camera.setPrice(400000);
		 
		// 가격 읽어오기
		 int price = camera.getPrice();
		 System.out.println(price);
		

	}

}
