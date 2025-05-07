package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강", "검정");
		//System.out.println(s01.toString());
		
		Triangle triangle = new Triangle("주황", "검정", 10, 5);
		
		//System.out.println(triangle.toString());
		
		//triangle.draw();
		
		
		Rectangle rectangle = new Rectangle("주황", "초록", 10, 20);
		
		//System.out.println(rectangle.toString());
		//rectangle.draw();
		
		Circle circle = new Circle("빨강", "검정", 5);
		//System.out.println(circle.toString());
		
		//circle.draw();
		
		//모든 도형을 하나의 배열로 관리하고 싶다
		
		Shape st = new Triangle("초록", "초록", 100, 100);
		//st.draw(); 안됨
		//st.getWidth(); 안됨
		//st.getHeight(); 안됨
		//st.getFillColor();
		
		Shape sc = new Circle("빨강", "빨강", 50);
		//sc.getRadius(); 안됨
		//sc.draw(); 안됨
		// 부모(shape)에 있는것만 됨
		
		Shape sr = new Rectangle("노랑", "노랑", 33, 33);
		
		//하나의 배열에 모든 도형을 담는다. --> 자식 쪽의 기능은 사용할 수 없다
		//모든 도형을 담을 수 있는 배열
		Shape[] sArray = new Shape[3];
		
		//도형 담기
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		//전체 draw 출력 (자식쪽의 기능으로 사용할 수 없다)
		//해결방법 --> 오버라이딩
		//                  : 부모 쪽이 자식 쪽과 똑같은 메소드를 작성해서 덮어쓰도록 만든다
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
			
	}

}
