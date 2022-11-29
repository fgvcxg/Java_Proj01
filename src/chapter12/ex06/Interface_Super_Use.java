package chapter12.ex06;


interface A{
	
	//A라는 인터페이스로 만든 클래스가 1000개면 인터페이스가 하나라도 추가되면 1000개를 다 변경해야함
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨
	//default 메소드 : 인터페이스 내에서 구현부가 있는 메소드
		//모든 자식 클래스에서 상속되어 내려감. 새로운 기능을 추가할때
	default void cde() {	//2020년에 구현된 메소드를 추가
		System.out.println("블루투스 기능 추가");
	}
	
	//추상메소도 : public abstract 가 생략됨 <== 실행부가 없는 메소드{}
		//자식 클래스에서는 선언만된 메소드를 구현해야될 의무
	void abc();	//2000년에 구현된 메소드
	void bcd();	//2005년에 구현된 메소드
	
}

class B implements A{	//extends Object가 생략되어 있다
	@Override
	public void abc() {
		System.out.println("와이파이 기능 1");	
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");		
	}
	
	public void def() {	//자식 클래스에서 인터페이스의 메소드 호출 : A.super.메소드
		//인터페이스의 메소드 호출시 : 
		A.super.cde();	//인터페이스 A 의 cde() 메소드 호출
//		super.cde();	//Object 클래스의 cde() 메소드 호출
	}
}

public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식 클래스에서 인터페이스에 구현된 default 메소드 호출시 : 
		
		//1. 객체 생성
		A a1 = new B();
		a1.abc();		//A 인터페이스에 존재함	//B()에서 오버라이딩됨
		a1.bcd();		//A 인터페이스에 존재함	//B()에서 오버라이딩됨
		a1.cde();		//A 인터페이스에 존재함	//default 메소드
		
		System.out.println("=========================");
		//a1 을 B 타입으로 다운캐스팅해야 def() 메소드를 호출 할 수 있다
		
		B b1 = (B) a1;
		b1.def();

	}

}