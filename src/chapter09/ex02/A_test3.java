package chapter09.ex02;

import chapter09.ex01.A;

//외부 클래스, 상속 관계가 설정된 클래스
public class A_test3 extends A{
	
	int k = a;	// a : public
	int l = b;	// b : protected
	//int m = c;	// c : default	//외부 패키지에서 접근 불가
	//int n = d;	// d : private	//외부 패키지에서 접근 불가

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_test3 a1 = new A_test3();
		System.out.println(a1.a);
		System.out.println(a1.b);
		//System.out.println(a1.c);
		//System.out.println(a1.d);
		
		a1.adb();
		a1.bcd();
		//a1.cde();
		//a1.def();
	}

}
