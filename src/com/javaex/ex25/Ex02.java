package com.javaex.ex25;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6};
		
		
		
		try {
			System.out.println(intArray[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
			//System.out.println(e.toString());
		} //finally {}
		

	}

}
