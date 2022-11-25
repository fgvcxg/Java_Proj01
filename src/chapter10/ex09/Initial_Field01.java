package chapter10.ex09;

class Student {
	//필드
	String name;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int month;
	
	Student(){}
	Student(String name, int stuID, int age, String stuAdd, String stuPhone, double weight){
		
		this.name = name;
		this.stuID = stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		if(month>=1 && month<12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		
	}
	
	
	//getter(필드의 값을 리턴으로 돌려줌), setter(인풋 값을 받아서 필드에 적용)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=1 && month<12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
	
	
	//toString() 재정의 : 객체의 Heap 메모리의 주소값 출력, hashcode로 출력(16진수)
	//객체 자체를 출력했을 때 toString() 가 작동
	@Override
	public String toString() {		//Object 클래스의 메소드, 모든 자바의 클래스는 Object를 상속
		return "Student [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + "]";
	}
	
	
	
}

public class Initial_Field01 {

	public static void main(String[] args) {
		//1. 객체를 생성후 직접 필드의 값들 할당.
		//2. 객체를 생성할 때 생성자를 사용해서 필드의 값을 할당
		//3. DTO(Data Transper Object), VO(Value Object)
				// : client  에게 값을 받아서 DAO에 값을 전송
					//DAO(Data Acess Object) : DataBase 에 Insert, Update, Delete
				// getter(필드의 값을 읽을 때), setter(필드의 값을 할당할 때)를 사용해서 값을 넣어줌
		
		//1. 객체를 생성후 직접 필드의 값을 할당
		Student s1 = new Student();
		s1.name = "홍딜동";
		s1.age = 20;
		s1.stuAdd = "서울 종로";
		s1.stuID = 1111;
		s1.stuPhone = "010-1111-1111";
		s1.weight = 80.5;
		
		System.out.println(s1);				//객체를 출력할때 toString() 메소드가 호출이 됨
		System.out.println(s1.toString());
		System.out.println("==================");
		
		//2. 객체를 생성시 생성자를 통해서 필드의 값을 할당
		Student s2 = new Student("이순신", 2222,30,"서울 강남", "010-2222-2222", 100.3);
		System.out.println(s2);				//객체를 출력할때 toString() 메소드가 호출이 됨
		System.out.println(s2.toString());
		System.out.println("==================");
		
		//3. Setter 를 사용해서 값을 넣고 getter 를 사용해서 필드의 값을 출력
		Student s3 = new Student();
		
		s3.setName("강감찬");
		s3.setAge(40);
		s3.setStuAdd("서울 성북");
		s3.setStuID(3333);
		s3.setStuPhone("010-3333-3333");
		s3.setWeight(65.2);
		
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println("==================");
		
		//getter 출력 : 필드의 값을 리턴으로 호출하는 곳으로 돌려줌
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getStuAdd());
		System.out.println(s3.getStuID());
		System.out.println(s3.getStuPhone());
		System.out.println(s3.getWeight());
		
		
		
		
	}

}
