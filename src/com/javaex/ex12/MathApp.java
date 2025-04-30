package com.javaex.ex12;

public class MathApp {

	public static void main(String[] args) {
		
		//메소드오버로딩
		
		Math math = new Math();
		
		
		/*
		//같은 이름으로 메소드를 못 만들면 (오버로딩이 안되면)
		math.plusIntInt(3,6);
		math.plusIntDouble(5, 3.2);
		math.plusDoubleInt(3.2, 5);
		math.plusDoubleDouble(3.2, 5.5);
		*/
		
		math.plus(4, 2);
		math.plus(3.5, 3.3);
		math.plus(3.4, 2);
		math.plus(2, 3.5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
