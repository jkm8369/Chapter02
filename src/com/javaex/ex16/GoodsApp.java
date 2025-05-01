package com.javaex.ex16;

public class GoodsApp {

	public static void main(String[] args) {
		
		//int[] intArr =new int[3];
		
		//Goods를 관리할 배열 3칸을 메모리에 올린다
		Goods[] goodsArr= new Goods[4];
		
		//상품을 메모리에 올린다
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 1000000); 
		Goods haribo = new Goods("하리보", 500);
		
		//배열에 상품의 !!!!!!!!!!주소!!!!!!!!!!!를 대입한다
		goodsArr[0] = cup;
		goodsArr[1] = camera;
		goodsArr[2] = computer;
		goodsArr[3] = haribo;
		
		//모든 상품의 이름을 출력해라
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		
		
		
		for(int i=0; i<goodsArr.length; i++) {
			goodsArr[i].showInfo();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
