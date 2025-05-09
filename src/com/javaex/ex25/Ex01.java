package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {

	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		try {
			result = 100/num;
			
		} catch(ArithmeticException e) {
			//System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다");
			
		} finally {
			System.out.println("공통영역");
		}
		
		System.out.println(result);
		
		

		
		
		
		sc.close();
		
		
		/*
		try {
			//예외가 발생할 가능성이 있는 코드
			
		} catch(처리할 예외 타입) {
			//예외 처리문
			
		} finally { //생략 가능
			//예외 발생 여부와 상관없이 실행되는 영역
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
