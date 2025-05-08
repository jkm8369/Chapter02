package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape s01 = new Shape("빨강", "검정");  //부모만 메모리에 올라옴
		//System.out.println(s01.toString());
		
		Triangle triangle = new Triangle("주황", "검정", 10, 5);  //자식 쪽이 가려지지 않음
		
		//System.out.println(triangle.toString());
		
		//triangle.draw();
		
		
		Rectangle rectangle = new Rectangle("주황", "초록", 10, 20);   //자식 쪽이 가려지지 않음
		
		//System.out.println(rectangle.toString());
		//rectangle.draw();
		
		Circle circle = new Circle("빨강", "검정", 5);  //자식 쪽이 가려지지 않음
		//System.out.println(circle.toString());
		
		//circle.draw();
		
		//모든 도형을 하나의 배열로 관리하고 싶다
		
		Shape st = new Triangle("초록", "초록", 100, 100);  //부모쪽만 보임 --> 왜? --> 하나로 관리하려고
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
		//sArray[0] = triangle; // 업캐스팅 자동으로 섞어쓰기된다
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		//전체 draw 출력 (자식쪽의 기능으로 사용할 수 없다)
		//해결방법 --> 오버라이딩
		//                  : 부모 쪽이 자식 쪽과 똑같은 메소드를 작성해서 덮어쓰도록 만든다
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//첫번째방 (삼각형)의 가로값을 읽고싶다 --> 가려져서 못 읽는다
		System.out.println(((Triangle)sArray[0]).getWidth());
		
		//원의 반지름
		System.out.println(((Circle)sArray[1]).getRadius());
		
		//사각형의 가로
		System.out.println(((Rectangle)sArray[2]).getWidth());
		
		
		//Shape s = new Shape();  //abstract가 있으면 메모리에 올리면 안된다
		//s.draw();
		
		
		
			
	}

}
