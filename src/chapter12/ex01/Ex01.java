package chapter12.ex01;

abstract class Calc{	//사칙 연산을 계산 하는 계산기 클래스
	abstract int add(int a , int b);	//더하기 연산
	abstract int diff(int a , int b);	//빼기 연산
	abstract int mul(int a , int b);	//곱하기 연산
	abstract double div(int a, int b);	//나누기 연산	
	
}

class Calc_Impl extends Calc{		//Calc 를 구현한 클래스
	@Override
	int add(int a, int b) {
		System.out.printf("두수의 합계는 : %d\n" , a+b);
		return 0;
	}
	@Override
	int diff(int a, int b) {
		System.out.printf("두수의 차이는 : %d\n" , a-b);
		return 0;
	}
	@Override
	int mul(int a, int b) {
		System.out.printf("두수의 곱은 : %d\n" , a*b);
		return 0;
	}
	@Override
	double div(int a, int b) {
		System.out.printf("두수의 나누기는 : %f\n" , (double)(a+b)/2);
		return 0;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		int a =5, b= 4;
		
		//1. 구현한 클래스의 메소드 호출후 출력
		Calc a1 = new Calc_Impl();
		a1.add(a, b);
		a1.diff(a, b);
		a1.mul(a, b);
		a1.div(a, b);
		
		System.out.println("========================");
		
		
		//2. 익명 클래스로 메소드 호출후 출력
		Calc a2 = new Calc() {
			
			@Override
			int mul(int a, int b) {
				System.out.printf("두수의 곱은 : %d\n" , a*b);
				return 0;
			}
			
			@Override
			double div(int a, int b) {
				System.out.printf("두수의 나누기는 : %f\n" , (double)(a+b)/2);
				return 0;
			}
			
			@Override
			int diff(int a, int b) {
				System.out.printf("두수의 차이는 : %d\n" , a-b);
				return 0;
			}
			
			@Override
			int add(int a, int b) {
				System.out.printf("두수의 합계는 : %d\n" , a+b);
				return 0;
			}
		};
		
		a2.add(a, b);
		a2.diff(a, b);
		a2.mul(a, b);
		a2.div(a, b);
		

	}

}
