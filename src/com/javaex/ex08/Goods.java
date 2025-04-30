package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {  //기본 생성자 => 자동으로 생김
					  //다른 생성자가 있으면 자동으로 생기지 않는다
		//메모리에 올리는 일 (엄청난걸 해준다)
		System.out.println("Goods()");
	}
	
	public Goods(String name, int price) {
		//메모리에 올리는 일 (엄청난걸 해준다)
		this.name = name;
		this.price = price;
	}
	
	
	//메소드 gs
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice () {
		return price;
	}
	
	public void showInfo() {
		System.out.println("==============================");
		System.out.println(name);
		System.out.println(price);
		System.out.println("==============================");
	}
	
	
	//메소드 일반
	
	
	
	
	
	
	
	
	
	
}
