package chapter07.ex05;

class Student{
	//필드 선언
	String stuName;
	int stuNo;
	String stuPhone;
	String stuAddr;
	int stuAge;
	double stuWeight;
	
	Student(){		//기본 생성자에서 초기값을 할당
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName,stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName, int stuNo, String stuPhone,String stuAddr){
		this(stuName,stuNo,stuPhone);
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNo, String stuPhone,String stuAddr,int stuAge){
		this(stuName,stuNo,stuPhone,stuAddr);
		this.stuAge = stuAge;
	}
	
	Student(String stuName, int stuNo, String stuPhone,String stuAddr,int stuAge,double stuWeight){
		this(stuName,stuNo,stuPhone,stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}
	
	void print() {
		System.out.println("학생의 이름 : " + stuName);
		System.out.println("학생의 번호 : " + stuNo);
		System.out.println("학생의 전호번호 : " + stuPhone);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 나이 : " + stuAge);
		System.out.println("학생의 몸무게 : " + stuWeight);
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.print();
		
		System.out.println();
		System.out.println("== 매개변수가 1개인 메소드==");
		Student s2 = new Student("A");
		s2.print();
		
		System.out.println();
		System.out.println("== 매개변수가 2개인 메소드==");
		Student s3 = new Student("B",1);
		s3.print();
		
		System.out.println();
		System.out.println("== 매개변수가 3개인 메소드==");
		Student s4 = new Student("C",2,"010-1111-1111");
		s4.print();
		
		System.out.println();
		System.out.println("== 매개변수가 4개인 메소드==");
		Student s5 = new Student("D",3,"010-2222-2222","인천");
		s5.print();
				
		System.out.println();
		System.out.println("== 매개변수가 5개인 메소드==");
		Student s6 = new Student("F",4,"010-3333-3333","수원");
		s6.print();
		
		System.out.println();
		System.out.println("== 매개변수가 6개인 메소드==");
		Student s7 = new Student("G",5,"010-4444-4444","안양",20);
		s7.print();
		
		System.out.println();
		System.out.println("== 매개변수가 7개인 메소드==");
		Student s8 = new Student("H",6,"010-5555-5555","화성",30,100.0);
		s8.print();

	}

}
