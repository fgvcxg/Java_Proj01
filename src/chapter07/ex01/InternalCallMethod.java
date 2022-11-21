package chapter07.ex01;

public class InternalCallMethod {

	public static void main(String[] args) {
		// 클래스 내부에서 다른 메소드 호출
			//main 메소드는 메소드 이름 앞에 public : 다른 패키지에서 호출이 가능 하다.
			//static : 인스턴스화 하지 않고 사용 가능하다. 객체를 생서하지 않고 사용 가능하다.
		
		//print 메소드 호출	(객체 생성 없이 바로 호출이 가능)
		print();
		
		System.out.println("=================================");
		
		//twice (33);
		int ab = twice(33);	//twice (int k)
		System.out.println(ab);

		System.out.println("=================================");
		
		
		//sum 메소드 호출
		double dc = sum(4, 5.0);
		System.out.println(dc);
		
		System.out.println(sum (8, 11.5));
		
		System.out.println("=================================");
		
		
		//sum2는 바로 호출시 오류가 발생 < == 객체화 해서 호출
		//double de =sum2(20,33.3);
		
		//sum2 메소드 호출 : 인스턴스 메소드 : 객체화 해야 사용 가능
		
		
		
		
		
	}
	
	//메소드 이름 앞에 static 키를 넣으면 객체의 생성 없이 호출이 가능합.
	
	public static void print() {
		System.out.println("안녕 ");
	}
	
	// 정수를 인풋 받아 배로 증가
	public static int twice(int k) {
		
		return k *2;
	}
	
	// 정수와 실수를 인풋 받아 더함
	public static double sum(int a, double b) {
			
		return a + b;
	}
		
	//static 키 없이 메소드 생성 : 인스턴스 메소드 (객체화 해야 호출이 가능)
	public double sum2(int m, double n) {
		return m+n;
	}
	

}
