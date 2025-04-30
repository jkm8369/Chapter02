package com.javaex.ex10;

public class Song {

	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	
	
	//기본생성자
	public Song() {}
	
	//생성자 구분 규칙   Song(String, String)
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	/*
	//생성자 구분 규칙 Song(String, String)
	public Song(String title, String album) {
		this.title = title;
		this.album = album;
	}
	*/
	
	//생성자 구분 규칙 Song(int, String)
	//생성자 구분 규칙 Song(String, int)
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	
	//생성자 5개
	public Song(String artist, String title, String album, int year, String composer){
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;    // 복잡한 로직이 있다.
		this.composer = composer;
	}
	
	
	//6개 한번에 받는 생성자
	public Song(String artist, String title, String album, int year, int track, String composer) {
		//다른 생성자를 호출
		//this() --> Song()를 호출
		this(artist, title, album, year, composer); // 메모리
		
		//this(); 는 Song()이 실행된다
		this.track = track; // 일반적인 업무는 메모리에 올라간후에 해야한다
	}
		
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
	
	
	
	
	//메소드 gs
	
	
	
	
	
	//메소드 일반
	
	
	
	
	
	
	
	
}
