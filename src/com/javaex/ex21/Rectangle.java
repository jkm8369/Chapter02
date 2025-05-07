package com.javaex.ex21;

public class Rectangle {

	//필드
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	//메소드 일반
	
	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("==========사각형을 그렸습니다===========");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("==================================");
	}
	
	
	
	
	
	
	
	
	
	
}
