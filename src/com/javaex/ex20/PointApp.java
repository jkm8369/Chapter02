package com.javaex.ex20;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(4, 4);
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");	
		
		System.out.println(cp1.getColor());
		
		System.out.println(cp2.getX());
		System.out.println(cp2.getY());
		System.out.println(cp2.getColor());
		
		cp2.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
