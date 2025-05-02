package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {
		
		/*
		//이름 나이 학교이름
		//Student에 extends Perosn 지우고 테스트
		//Student가 Person을 상속받기전
		Student s01 = new Student();
		s01.setSchoolName("제주고등학교");
		//이름 x
		//나이 x
		*/
		
		
		Student s02 = new Student();
		s02.setSchoolName("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);
		
		//Student s03 = new Student("서울고등학교");
		
		//이렇게 쓰는게 제일 자연스럽다
		Student s03 = new Student("이효리", 20, "제주고등학교");
		//생성자 완료순서 : Person(2) ==> Student(3)
		
		System.out.println(s03.getSchoolName());
		System.out.println(s03.getName());
		System.out.println(s03.getAge());
		
		s03.showInfo();
		
		
		
		
	}

}
