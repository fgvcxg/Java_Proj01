package chapter07;

class Calc{
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add(int a, int b) {
		return a + b;
	}
	
	//빼기
	int diff(int a, int b) {
		return a - b;
	}
	
	//곱하기
	int mul(int a, int b) {
		return a * b;
	}
	
	//나누기 : double
	double div(double a, double b) {
		return a/b;
	}
	
	//면적(Rec)
	double rec(double a, double b) {
		return a*b;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.diff(50, 22));
		System.out.println(calc.mul(40, 50));
		System.out.println(calc.div(100, 55));
		System.out.println(calc.rec(20, 68.8));
		

	}

}
