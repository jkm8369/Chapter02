package com.javaex.ex26;

import java.io.IOException;
import java.util.Scanner;

public class MyFileApp {

	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		*/
		
		/*
		MyFile mf = new MyFile();
		String str = mf.read2("C:\\javaStudy\\java\\노래.txt");
		System.out.println(str);
		*/
		
		MyFile mf = new MyFile();
		
		try {
			mf.read3("C:\\javaStudy\\java\\노래.txt");
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
	
	

	}
}
