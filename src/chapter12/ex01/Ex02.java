package chapter12.ex01;

abstract class Calc2{	//사칙 연산을 계산 하는 계산기 클래스
	abstract void add(int a , int b);	//더하기 연산
	abstract void diff(int a , int b);	//빼기 연산
	abstract void mul(int a , int b);	//곱하기 연산
	abstract void div(int a, int b);	//나누기 연산	
	
}
class Calc_Impl2 extends Calc2{
	@Override
	void add(int a, int b) {
		System.out.printf("두수의 합계는 : %d\n" , a+b);
		
	}
	@Override
	void diff(int a, int b) {
		System.out.printf("두수의 차이는 : %d\n" , a-b);
		
	}
	@Override
	void div(int a, int b) {
		System.out.printf("두수의 나누기는 : %.2f\n" , (double)(a+b)/2);
		
	}
	@Override
	void mul(int a, int b) {
		System.out.printf("두수의 곱은 : %d\n" , a*b);
		
	}
	
	
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 6;
		Calc2 a1 = new Calc_Impl2();
		a1.add(a, b);
		a1.diff(a, b);
		a1.mul(a, b);
		a1.div(a, b);
		
		System.out.println("================");
		
		Calc2 a2 = new Calc2() {
			
			@Override
			void mul(int a, int b) {
				System.out.printf("익명 : 두수의 곱은 : %d\n" , a*b);
				
			}
			
			@Override
			void div(int a, int b) {
				System.out.printf("익명 : 두수의 나누기는 : %.3f\n" , (double)(a+b)/2);
				
			}
			
			@Override
			void diff(int a, int b) {
				System.out.printf("익명 : 두수의 차이는 : %d\n" , a-b);
				
			}
			
			@Override
			void add(int a, int b) {
				System.out.printf("익명 : 두수의 합계는 : %d\n" , a+b);
				
			}
		};
		a2.add(a, b);
		a2.diff(a, b);
		a2.mul(a, b);
		a2.div(a, b);

	}

}
