package chapter07.ex05;

class A{
	//필드
	int m;
	int n;
	
	//메소드 : 정수값 2개를 받음
	void init(int a, int b) { 	// 메소드 내의 : a, b, c	<== 지역 변수 : stack 저장
		int c;
		c = 3;
		m = a;			//this.m : 기본적으로 this 키가 생략되어있다
		n = b;			//this.n
	}
	
	void init2(int m, int n) { 	

		this.m = m;			
		this.n = n;			
	}
	
	//메소드
	void work() {
		this.init (2,3);
		System.out.println( m + " " + n );
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		// this : 자기 자신 객체의 필드나 메소드, <== 필드, 메소드에 적용
		// this() : 자신객체의 다른 생성자 호출시 사용
		// super : 상속에서 부모의 객체의 필드나, 메소드를 사용
		// super() : 부모클래스의 생ㅅ어자 호출할 때 사용
		
		

	}

}
