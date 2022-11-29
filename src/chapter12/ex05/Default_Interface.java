package chapter12.ex05;

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
//	void cde();	//2010년에 구현된 메소드
	
}

//가정 : interface A를 구현한 클래스가 1000개 존재
class Aa implements A{
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 1");	
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 2");		
	}
}

class Aaa implements A{
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 3");	
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 4");		
	}
}

class Aaaa implements A{
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 5");	
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 6");		
	}
	//default 메소드도 오버라이딩이 가능
	
	@Override
	public void cde() {
		System.out.println("A 인터페이스의 default 메소드 오버라이딩");
	}
}

public class Default_Interface {

	public static void main(String[] args) {
		// interface : 인터페이스의 모든 필드와 메소드는 public 이 생략되어 있다.
				//구현된 클래스에서 메소드를 오버라이딩 할때 public
		//모든 필드는 : public static final
		//모든 메소드는 추상 메소드이어야 한다 : public abstract
			//예외 : ver1.8 부터 새로운 기능이 추가, default, static 메소드가 추가됨
				//인터페이스에서 구현부가 있는 메소드. default, static
		//default : 인터페이스에서 구현구가 있는 메소드
				//인터페이스를 구현한 모든 클래스에 상속되어 적용
				//오버라이딩도 가능
				//새로운 기능을 추가할때 하위의 구현된 클래스의 오류 없이 적용 가능하도록 함
		
		//인터페이스를 구현한 클래스를 객체화해서 타입으로 지정함
		A a1 = new Aa();
		A a2 = new Aaa();
		A a3 = new Aaaa();
		
		//2. 인터페이스의 메소드 호출 ==> 오버라이딩된 메소드가 호출
		a1.abc();
		a1.bcd();
		a1.cde();	//default 메소드
		
		System.out.println("===================");
		
		a2.abc();
		a2.bcd();
		a2.cde();	//default 메소드
		
		System.out.println("===================");
		
		a3.abc();
		a3.bcd();
		a3.cde();	//default 메소드
		

	}

}
