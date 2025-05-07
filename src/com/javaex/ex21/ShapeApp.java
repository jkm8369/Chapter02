package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle("주황", "검정", 10, 5);
		
		System.out.println(triangle.toString());
		
		triangle.draw();
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		
		rectangle.draw();
		
		Circle circle = new Circle();
		
		triangle.setLineColor("빨강");
		rectangle.setLineColor("빨강");
		circle.setLineColor("빨강");
		
		Circle[] cArray = new Circle[3];
		Rectangle[] rArray = new Rectangle[3];
		Triangle[] tArray = new Triangle[3];
		
	}
	
}
		
		

