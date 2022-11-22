package chapter07.ex05;

class Aa{	//this() 를 사용하지 않고 생성자 작성
	//필드
	int m1, m2, m3, m4;
	
	//생성자
	Aa(){		//기본생성자 : 필드의 기본값 초기화
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a){	
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a, int b){	
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a, int b, int c){		
		m1 = a; 
		m2 = b;
		m3 = c;
		m4 = 4;
	}
	
	Aa(int a, int b, int c, int d){		
		m1 = a; 
		m2 = b;
		m3 = c;
		m4 = d;
	}
	
	
	//메소드 : 필드의 값을 출력하는 메소드
	void print() {
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
	}
}

class Bb{	//this() 를 사용하고 생성자 작성
	//필드
	int m1, m2, m3, m4;
	
	//생성자
	Bb(){		//기본생성자 : 필드의 기본값 초기화
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Bb(int a){		//기본생성자 : 필드의 기본값 초기화
		this();
		m1 = a;
	}
	Bb(int a, int b){	
		this(a);
		m2 = b;
	}
	Bb(int a,int b, int c){	
		this(a, b);
		m3 = c;
	}
	Bb(int a,int b, int c,int d){		
		this(a,b,c);
		m4 = d;
	}
	
	//메소드 : 필드의 값을 출력하는 메소드
	void print() {
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
	}
		
}

public class This_Method2 {

	public static void main(String[] args) {
		// this() : 생성자 내부에서 사용이 되고, 첫 라인에 위치 해야 하고, 자신의 객체의 다른 생성자 호출
		//			// 생성자를 여러개를 생성할때 코드를 줄여 줄 수 있다.
		
		//1. Aa 클래스에서 생성자 호출
			// 기본 생성자 호출
		System.out.println("== Aa 클래스의 기본 생성자 호출 ===");
		Aa a1 = new Aa();
		a1.print();
		
			//매개변수 정수 1개인 생성자 호출
		System.out.println("== Aa 클래스의 매개변수 정수 1개인 생성자 호출 ===");
		Aa a2 = new Aa(10);
		a2.print();
		
			//매개변수 정수 2개인 생성자 호출
		System.out.println("== Aa 클래스의 매개변수 정수 2개인 생성자 호출 ===");
		Aa a3 = new Aa(10,20);
		a3.print();
		
			//매개변수 정수 3개인 생성자 호출
		System.out.println("== Aa 클래스의 매개변수 정수 3개인 생성자 호출 ===");
		Aa a4 = new Aa(10,20,30);
		a4.print();
		
			//매개변수 정수 4개인 생성자 호출
		System.out.println("== Aa 클래스의 매개변수 정수 4개인 생성자 호출 ===");
		Aa a5 = new Aa(10,20,30,40);
		a5.print();
		
		//2. Bb 클래스의 생성자 호출
			//this() 메소드를 사용해서 생성자 호출
		
			//기본 생성자
		System.out.println("== Bb 클래스에서 기본 생성자 호출 ==");
		Bb b1 = new Bb();
		b1.print();
		
		System.out.println("== Bb 클래스의 매개변수 정수 1개인 생성자 호출 ==");
		Bb b2 = new Bb(10);
		b2.print();
				
		System.out.println("== Bb 클래스의 매개변수 정수 2개인 생성자 호출 ==");
		Bb b3 = new Bb(10,20);
		b3.print();
				
		System.out.println("== Bb 클래스의 매개변수 정수 3개인 생성자 호출 ==");
		Bb b4 = new Bb(10,20,30);
		b4.print();
		
		System.out.println("== Bb 클래스의 매개변수 정수 4개인 생성자 호출 ==");
		Bb b5 = new Bb(10,20,30,40);
		b5.print();
		
		
		
		

	}

}
