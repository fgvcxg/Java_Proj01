package chapter11.ex01;

class A{
	int a =3;			//필드 : 값을 수정할 수 있다
	final int b = 5;	//상수 : 값을 수정할 수 없다
	A(){}
}

class B{
	int a ;
	final int b;
	B(){
		a=3;
		b=5;	//상수를 주지 않았을때는 변경이 한번만 가능하다
	}
}
class C {
	int a = 3;
	final int b =5;
	C (){
		a=7;
		//b=10;	//한번 상수로 지정하면 변경이 불가 하다
	}
}

public class Final_Field {

	public static void main(String[] args) {
		// final modifier :
			//1. 필드 : 값을 수정하지 못하도록[상수]
			//2. 메소드 : 자식 클래스에서 Override를 못한다
			//3. 클래스 : 상속이 불가한 클래스
		
		A a1 = new A();
		
		//a : 필드[변수] : 값을 수정할 수 있다
		//b : 상수 : 값을 수정할 수 없다
		a1.a = 5;
		//a1.b = 6;
		
		
	}

}
