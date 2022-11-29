package chapter13.ex01;

class C {
	
	int a = 5;
	int b = 4;
	
	int add(int a, int b) {
		return a + b;
	}
	int diff(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(int a, int b) {
		return (double)a / (double)b;
	}
	
	class D{
		void abc() {
			System.out.println("두수의 합 : " + add(a,b));
			System.out.println("두수의 차 : " + diff(a,b));
			System.out.println("두수의 곱 : " + mul(a,b));
			System.out.println("두수의 나눕셈 : " + div(a,b));
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1 = new C();
		C.D d1 = c1.new D();
		d1.abc();
		

	}

}
