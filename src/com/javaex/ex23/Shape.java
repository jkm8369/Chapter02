package com.javaex.ex23;

public abstract class Shape {

	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
		super();
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	//메소드gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	/*
	public void draw() {
		//코드 넣을게 없어서 억지로 씀
		
	}
	*/
	
	//코드는 작성하고 싶어도 못한다 --> 안만들면 됨
	//그러나 필요는 하다 --> 자식들이 만들어야 한다
	//오버라이딩 용 메소드 작성 메소드 껍데기만 만들기
	//abstract 사용한 메소드는 자식이 꼭 구현해야한다
	public abstract void draw();  //내용을 안써도 된다--> 오버라이딩용 메소드
					     
	public abstract void area();
	
	
	
}
