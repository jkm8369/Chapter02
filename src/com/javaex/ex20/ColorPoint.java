package com.javaex.ex20;

public class ColorPoint extends Point {

	//필드
	private String color;

	
	//생성자
	public ColorPoint() {
		
	}

	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);   //부모의 생성자 이용
		
		/*
		super.setX(x);
		super.setY(y);   //부모 필드에 직접 입력
		*/
		
		/*
		//부모의 필드가 protected 일때
		super();
		super.x = x;
		super.y = y;
		*/
		
		this.color = color;
	}
		
	
	//메소드 gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("==================================");
		System.out.println("x= " + super.getX());
		System.out.println("y= " + super.y);
		System.out.println("==================================");
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
