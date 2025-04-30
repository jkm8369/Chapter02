package com.javaex.ex13;

public class Tv {

	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//기본생성자
	public Tv() {
		
	}
	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
	//메소드 gs
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	
	public void setPower(boolean power) {
		if(power == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}
	
	
	public void setChannel(int channel) {
		if(channel>255) {
			this.channel = 255;
		} else if(channel<0) {
			this.channel = 0;
		} else {
			this.channel = channel;
		}
	}
	
	public void setChannel(boolean up) {
		if(power==false) {
			this.channel = channel-1;   // 이건 아닌듯
		}
		if(up==true) {
			this.channel = channel+1;
			if(channel>255) {
				this.channel = 255;
			}
		} else {
			this.channel = channel-1;
			if(channel<0) {
				this.channel = 0;
			} 
		}
		
	}
	
	public void setVolume(int volume) {
		if(volume>100) {
			this.volume = 100;
		} else if(volume<0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}
	
	public void setVolume(boolean up) {
		if(up==true) {
			this.volume = volume+1;
			if(volume>100) {
				this.volume = 100;
			}
		} else {
			this.volume = volume-1;
			if(volume<0) {
				this.volume = 0;
			}
		}
	}
	
	
	//메소드 일반
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume);
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
