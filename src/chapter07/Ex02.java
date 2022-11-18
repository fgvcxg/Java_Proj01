package chapter07;

class Student{
	String stuName;		//학생 이름
	int stuNum;			//학번
	String stuAddr;		//학생의 주소
	String stuPhone;	//학생의 전화번호
	double weight;		//학생의 몸무게
	
	//생성자 오버로딩
	//기본 생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(){}
	
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	
	
	Student(String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	
	//필드의 값을 출력하는 메소드 void print(){ 필드의 값을 출력 }
	void print() {
		System.out.println("학생의 이름 : " + stuName);
		System.out.println("학생의 번호 : " + stuNum);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 전화번호 : " + stuPhone);
		System.out.println("학생의 몸무게 : " + weight);
	}
	
	
	
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		stu1.print();
		System.out.println("======================");
		
		Student stu2 = new Student("가나다", 14, "경기도");
		stu2.print();
		System.out.println("======================");
		
		Student stu3 = new Student("라마바", 28, "서울시", "010-1234-1234",100);
		stu3.print();

	}

}
