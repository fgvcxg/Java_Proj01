package chapter13.ex05.a;

interface A{
	void cry();
	void fly();
}

class B{
	//인터페이스 타입으로 객체 생성
	A a = new C();
	
	
	void abc() {
		a.cry();
		a.fly();
		
	}
	
	//이너 클래스 : 외부 파일에 별도로 생성하지 않고 클래스 내부에 생성후 바로 사용
	class C implements A{
		@Override
		public void cry() {System.out.println("크라이");}
		@Override
		public void fly() {System.out.println("플라이");}
		
	}
}

//A 클래스의 abc() 메소드 호출시 C 클래스의 구현된 메소드 출력


public class Anonymous_Class01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
