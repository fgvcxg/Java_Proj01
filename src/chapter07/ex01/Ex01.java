package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = ii(1,2,3);
		System.out.println(i);
		
		double d = dd(1,15.6,89.1);
		System.out.println(d);
		
		
		Ex01 e = new Ex01();
		String s = e.ss("이름이름", " 수량수량", "가격가격");
		System.out.println(s);
		
		

	}
	
	//정수값 2개를 인풋 받아 더해서 리턴하는 메소드(static)
	
	public static int ii(int a, int b, int c) {
		return a+b+c;
	}
	
	//실수값 3개를 인풋 받아 더해서 리턴하는 메소드(static)
	public static double dd(double a, double b, double c) {
		return a+b+c;
	}
	
	
	//문자열을 연결해서 출력하는 메소드(인스턴스 메소드 : static을 사용하지 않는 메소드
	//제품이름, 제품 수량, 제춤 가격
	public String ss(String a, String b, String c) {
		return a + " "+ b + " " + c;
	}

}
