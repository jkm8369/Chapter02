package com.javaex.ex19;

public class Student extends Person{

	// 필드
	private String schoolName;

	
	// 생성자
	public Student() {
		super("이효리", 22);
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		
		super(name, age);  // Person의 파라미터 2개짜리 생성자 실행
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	// 메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) { // 메모리
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("이름 " + getName());  // Person에 protected 써서 name으로 씀,  super.getName();시에 super 안써도 됨
		System.out.println("나이: " + age);  // Person에 protected 써서 age으로 씀,  super.getAge();시에 super 안써도 됨
		System.out.println("학교: " + schoolName);
		System.out.println("====================");
	}
	
	// 메소드 일반
	
	

	
	

	

}
