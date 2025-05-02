package com.javaex.ex17;

public class PointApp {

	public static void main(String[] args) {
		
		Point[] pArray = new Point[3];
		

		Point p01 = new Point(5,5);
		
		Point p02 = new Point(10, 10);
		
		Point p03 = new Point();
		p03.setX(20);
		p03.setY(20);
		
		/*
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		*/
		
		pArray[0] = p01;  // 배열에 !!!!!!!!!!주소!!!!!!!!!!를 대입
		pArray[1] = p02;  // 배열에 !!!!!!!!!!주소!!!!!!!!!!를 대입
		pArray[2] = p03;  // 배열에 !!!!!!!!!!주소!!!!!!!!!!를 대입
		
		/*
		System.out.println(pArray[0].toString());
		System.out.println(pArray[1].toString());
		System.out.println(pArray[2].toString());
		*/
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
			
			pArray[i].draw();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
