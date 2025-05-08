package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape[] sArray = new Shape[4];
		
		//Drawable[] dArray = new Drawable[4];
		
		Drawable dp = new Point(5, 100);
		
		
		/*
		dp.draw();
		System.out.println(((Point)dp).getX());
		*/
		
		Drawable dt = new Triangle("빨강", "빨강", 10, 20);
		
		/*
		dt.draw();
		System.out.println(((Triangle)dt).getHeight());
		System.out.println(((Triangle)dt).getFillColor());
		*/
		
		Drawable dr = new Rectangle("초록", "초록", 20, 200);
		
		Drawable dc = new Circle("파랑", "파랑", 5);
		
		Drawable[] dArray = {dt, dr, dc, dp};
		/*
		dArray[0] = dt;
		dArray[1] = dr;
		dArray[2] = dc;
		dArray[3] = dp;
		*/
		/*
		//한번에 면적 구하기 --> Point는 Shape으로 캐스팅 할 수 없다
		for(int i=0; i<dArray.length; i++) {
			((Shape)dArray[i]).area();
		}
		*/
		
		//dp가 Drawable 출신이냐?
		System.out.println(dp instanceof Drawable);
		//dp가 Point 출신이냐?
		System.out.println(dp instanceof Point);
		//dp가 Shape 출신이냐?
		System.out.println(dp instanceof Shape);
		//dt가 Shape 출신이냐?
		System.out.println(dt instanceof Shape);
		
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {   //방의 주소가 Shape 출신이냐?
				((Shape)dArray[i]).area();
			} else {
				System.out.println("면적 못 구함");
			}
		}
		
		
		

	}
}
