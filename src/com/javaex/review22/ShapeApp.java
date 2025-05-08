package com.javaex.review22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape shape = new Shape("초록", "검정");
		//System.out.println(shape.toString());
		
		
		Rectangle rectangle = new Rectangle("빨강", "하양", 50, 40);
		//System.out.println(rectangle.toString());
		//rectangle.draw();
		
		Triangle triangle = new Triangle("검정", "분홍", 20, 10);
		//System.out.println(triangle.toString());
		//triangle.draw();
		
		Circle circle = new Circle("보라", "주황" , 5);
		//System.out.println(circle.toString());
		//circle.draw();
		
		Shape sr = new Rectangle("파랑", "초록", 100, 30);
		
		Shape st = new Triangle("검정", "자주", 50, 15);
		
		Shape sc = new Circle("초록", "파랑", 20);
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = sr;
		sArray[1] = st;
		sArray[2] = sc;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		
		
	}

}
