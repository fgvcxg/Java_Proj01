package chapter10.ex10;

class C {
	String stuID;
	String name;
	int age;
	
	
	
	//생성자,  기본 생성자1
	C(){}
	
	C(String stuID, String name, int age){
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
	
	
	
	//toString 메소드 재정의 : 필드의 값을 출력, 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	//c1.equals(c2) //stuID 필드를 재정의 해서 같으면 true, 다르면 false
	@Override
	public boolean equals(Object obj) {
		if(this.stuID == ((C)obj).stuID) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1 = new C("123" , "qwer", 30);
		C c2 = new C("123" , "asd", 20);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));

	}

}
