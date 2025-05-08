package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		
		//나는 1개로 관리하고 싶다
		Shape[] sArray = new Shape[4];
		
		Shape t = new Triangle("빨강", "빨강", 5, 3);
		Shape r = new Rectangle("노랑", "노랑", 10, 10);
		Shape c = new Circle("파랑", "파랑", 5);
		
		//포인트
		
		sArray[0] = t;
		sArray[1] = r;
		sArray[2] = c;
		
		
		//포인트 추가 클래스 설계부터 억지로 만들었다
		Shape p = new Point(5, 5);
		sArray[3] = p;
		
		
		for(int i=0; i<sArray.length; i++) {
			//sArray[i].draw();
		}
		
		//넓이 출력
		for(int i=0; i<sArray.length; i++) {
			sArray[i].area();
			//포인트는 면적을 구할수 없는데 임의로 넣은 값이 출력된다.
		}
		
		//sArray[3]은 포인트 아래처럼 쓰면 색을 넣을 수 있다.
		sArray[3].setFillColor("빨강");
		
		
			
	}

}
