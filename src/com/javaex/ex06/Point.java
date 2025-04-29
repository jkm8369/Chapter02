package com.javaex.ex06;

public class Point {

	//필드
	
	private int x;
	private int y;
	
	//생성자
	
	
	//메소드 gs
	
	// x 대입
	public void setX(int x) {
		this.x = x;
	}
	
	// x 읽기
	public int getX() {
		return x;
	}
	
	// y 대입
	public void setY(int y) {
		this.y =y;
	}
	
	// y 읽기
	public int getY() {
		return y;
	}
	
	
	//메소드 일반
	public void draw() {
		System.out.println("점[x=" + x + ", y= " + y + "]을 그렸습니다.");
	}
	
	
	
	
	
	
}
