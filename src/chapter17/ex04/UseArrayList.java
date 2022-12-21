package chapter17.ex04;

import java.util.*;

class Student{
	String name;
	int stuID;
	
	//생성자를 사용해서 값을 인풋받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.stuID = stuID;
	}

	//toString() 재정의 : 객체 자체를 출력할 때 객체 주소가 출력되지 않고 메모리의 값 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
	
	
}

public class UseArrayList {

	public static void main(String[] args) {
		
		//ArrayList 에 저장될 객체는 Student 객체가 저장됨
		ArrayList<Student> a1 = new ArrayList();
		
		//Student 객체를 생성
		Student s1 = new Student("Hong", 1111);
		Student s2 = new Student("Lee", 2222);
		Student s3 = new Student("kang", 3333);
		
		//Student 객체를 ArrayList 컬랙션에 저장
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		//컬랙션의 내용을 순환하면서 출력
		for(int i =0;i< a1.size();i++) {
			Student ss1 = a1.get(i);
			System.out.println(ss1.toString());
		}
		System.out.println("==========================");
		
		//Enhanced For
		for(Student k : a1) {
			System.out.println(k.toString());
		}
				
		System.out.println("==========================");
		//모든 칼랙션은 컬랙샨 객체를 출력시 컬랙션의 들어간 값을 출력한다
		System.out.println(a1);
		System.out.println(a1.toString());

	}

}
