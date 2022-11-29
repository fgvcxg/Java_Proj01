package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형태로 출력
//1. Animal을 구현한 이너 클래스를 만들고 매서드 출력
//2. Animal을 익명 클래스로 생성해서 출력
//3. 객체 메서도의 인풋 배개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
//4. 참조변수를 만들지 않고 바로 출력

//1111111111111111111111
class Ast {
	
	class B implements Animal{
		@Override
		public void cry() {System.out.println("1st : 크라이");}
		@Override
		public void fly() {System.out.println("1st : 플라이");}
	}
	
	Animal a1 = new B();
	
	void aa() {
		a1.cry();
		a1.fly();
	}
	
}

//222222222222222222222
class Bnd{
	Animal a1 = new Animal() {
		
		@Override
		public void fly() {System.out.println("2nd : 플라이");}		
		@Override
		public void cry() {System.out.println("2nd : 크라이");}
	};
	
	void aa() {
		a1.cry();
		a1.fly();
	}
}
//333333333333333333333
class Crd{
	void cc(Animal a) {
		a.cry();
		a.fly();
	}
}

//44444444444444444444
class Dth{
	void dd(Animal a) {
		a.cry();
		a.fly();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		//1st
		Ast a = new Ast();
		a.aa();
		
		System.out.println("===================");
		
		//2nd
		Bnd b = new Bnd();
		b.aa();
		
		System.out.println("===================");
		
		//3rd
		Crd c = new Crd();
		
		Animal a1 = new Animal() {			
			@Override
			public void fly() {System.out.println("3rd : 플라이");}			
			@Override
			public void cry() {System.out.println("3rd : 크라이");}
		};
		
		c.cc(a1);
		
		System.out.println("===================");
		
		//4th
		
		Dth d = new Dth();
		d.dd(new Animal() {			
			@Override
			public void fly() {System.out.println("4th : 플라이");}			
			@Override
			public void cry() {System.out.println("4th : 크라이");}
		});
		

	}

}
