package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		
		Song song01 =new Song("아이유", "좋은 날", "Real", 2010, 3, "이민수");
		song01.showInfo();
		
		
		
		
		
		
		
		/*
		Song song02 = new Song("BIGBANG", "거짓말", "Always", 2007,"G-DRAGON");
		song02.showInfo();
		*/
		
		System.out.println("======================================================");
		
		Song song03 = new Song("BIGBANG", "거짓말", "Always", 2007, 73, "G-DRAGON");
		song03.showInfo();
		
		
		//아티스트, 노래제목, 앨범, 작곡가
		
		Song song02 = new Song("거짓말", "빅뱅");
		song02.showInfo();
		
		

	}

}
