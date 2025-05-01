package com.javaex.ex15;

public class Math {

	// 필드
	private static final double PI = 3.141592;
	
	// 생성자
	// public Math() {메모리}

	// 메소드 gs

	// 메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}

	public static double plus(int a, double b) {
		return a + b;
	}

	public static double plus(double a, int b) {
		return a + b;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double circleArea(int radius) {
		double result = PI * radius * radius;
		return result;
	}
	
	
}
