package chapter08.ex01;

import chapter08.ex02.Student;
import chapter07.*;				//주의 : 하위 패키지는 적용이 안된다.

public class Package {

	public static void main(String[] args) {
		//클래스 내부 구성요소
			//1. 필드, 2. 생성자, 3. 메소드, 4. 이너클래스
		//클래스 외부 구성요소
			//1. 패키지, 2. 임포트, 3. 외부클래스
		
		//1. 패키지(package) : 클래스를 조직화해서 관리하는 폴더
			//한 패키지내에 동일한 이름의 클래스는 올 수 없다.
			//외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한 경우
		//2. 임포트(import) : 다른 캐피지의 클래스를 사용하려 할 경우
		
		//Student 클래스의 객체 생성 : 다른 패키지에 존재하는 클래스
			//chapter08.ex02.Student
		
		//기본 생성자 호출
		Student s1 = new Student();
		s1.print();
		System.out.println();
		
		//매개변수 4개인 생성자 호출
		Student s2 = new Student("홍길동","1111",3,"서울");
		s2.print();
		
		System.out.println("=========================");
		
		//Car 클래스는 import 없이 전체이름으로 사용
		chapter08.ex02.Car car1 = new chapter08.ex02.Car();
		car1.print();
		
		System.out.println("=========================");
		
		chapter08.ex02.Car car2 = new chapter08.ex02.Car("삼성","검정",100);
		car2.print();
		

	}

}
