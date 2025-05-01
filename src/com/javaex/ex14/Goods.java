package com.javaex.ex14;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int count;
	
	
	
	// 생성자
	public Goods() {
		count = count + 1;
		System.out.println(Goods.count);
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count + 1;
		System.out.println(Goods.count);
	}

	// 메소드 gs
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public int getCount() {
		return count;
	}
	// 메소드 일반

	public void showInfo() {
		System.out.println("=============================");
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("=============================");
	}

}
