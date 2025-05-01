package com.javaex.ex14;

public class GoodsApp {

	//static 조사 ==> 스태틱영역에 올려놓는다
	//스태틱 메모리에서 main() 을 실행한다
	
	public static void main(String[] args) {
		
		
		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		
		
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		
		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();
		
		
		
		
		
		
		
		
		

	}

}
