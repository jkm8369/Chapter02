package com.javaex.ex19;

public class Person {

	//필드
	private String name;
	protected int age;
	
	
	//생성자
	public Person() { //메모리
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	//메소드 일반
	
	
	
	
	
	
	
	
	
}
