package com.javaex.ex05;


public class GoodsApp {

	public static void main(String[] args) {
		
		// 메모리에 올리고
		Goods camera = new Goods();
		Goods cup = new Goods();
		Goods computer = new Goods();
		
		// 니콘 세팅
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		// 머그컵 세팅
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		
		// LG그램 세팅
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		// 니콘 출력
		
		/*
		String cameraName = camera.getName();
		int cameraPrice = camera.getPrice();
		*/
		
		camera.showInfo();
		/*
		System.out.println("=================================");
		System.out.println("이름: " + cameraName );
		System.out.println("가격: " + cameraPrice );
		System.out.println("=================================");
		*/
		
		// 머그컵 출력
		/*
		String cupName = cup.getName();
		int cupPrice = cup.getPrice();
		*/
		
		cup.showInfo();
		/*
		System.out.println("=================================");
		System.out.println("이름: " + cupName);
		System.out.println("가격: " + cupPrice);
		System.out.println("=================================");
		*/
		
		// LG그램 출력
		/*
		String computerName = computer.getName();
		int computerPrice = computer.getPrice();
		*/
		
		computer.showInfo();
		
		
		/*
		System.out.println("=================================");
		System.out.println("이름: "+ computerName);
		System.out.println("가격: " + computerPrice);
		System.out.println("=================================");
		*/
		

	}

}
