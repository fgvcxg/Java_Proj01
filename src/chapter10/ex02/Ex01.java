package chapter10.ex02;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다");
	}
}
class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛나게 먹습니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 객체를 생성하면서 Human 타입으로 지정		:h1
		Human h1 = new Student();
		
		
		//2. Student 객체를 생성하면서 Student 타입으로 지정		:s1
		Student s1 = new Student();
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 		:h2
		Human h2 = new Student2();
		
		//4. Student2 객체를 생성하면서 Student 타입으로 지정		:s2
		Student s2 = new Student2();
		
		//5. Student2 객체를 성성하면서 Student2 타입으로 지정	:s3
		Student2 s3 = new Student2();

	}

}
