package com.javaex.ex13;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv= new Tv(7, 20, false);
		
		tv.status();
		
		
		tv.setPower(true);
		tv.setVolume(120);
		
		tv.status();
		
		tv.setVolume(false);
		
		tv.status();
		
		tv.setChannel(0);
		
		tv.status();
		
		tv.setChannel(false);
		tv.status();
		
		tv.setPower(false);
		tv.setChannel(true);
		tv.setChannel(true);
		tv.setChannel(true);
		tv.status();
		
		
		
		
		
		
		

	}

}
