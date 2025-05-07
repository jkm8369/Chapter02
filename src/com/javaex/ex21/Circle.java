package com.javaex.ex21;

public class Circle extends Triangle{

	//필드
	private int radius;

	
	//생성자
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	//메소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("==========원을 그렸습니다===========");
		System.out.println("면색: " + super.getFillColor());
		System.out.println("선색: " + super.getLineColor());
		System.out.println("반지름: " + radius);
		System.out.println("==================================");
	}
	
	
	
	
	
}
