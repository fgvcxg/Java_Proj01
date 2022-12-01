package chapter16.ex05;

//제너릭 메소드 : 일반 클래스내에 제너릭 타입을 가지는 메소드
class GenericMethods{
	
	//재너릭 메소드 : 일반 클래스 내부에 제너릭 타입의 메소드
	//접근 제어자 <외부에서 타입지정> 리턴타입 메소드명(타입 변수)	
	//다양한 타입의 값을 리턴으로 되돌려주는 메소드
	public <T> T method1 (T t) {
		return t;
	}
	
	//동일한 타입의 구 값을 인춧받아서 같으면 true, 다르면 false 를 리턴
	//제너릭에 넣는 타입변수 T에 올 수 있는 것은 기본 타입은 넣을 수 없다. wrapper 클래스만 올 수 있다.
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K,V> void method3 (K k, V v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기
		//일반 클래스의 객체 생성
		GenericMethods gm = new GenericMethods();
		
		String str1 = gm.<String>method1("Hi");
		String str2 = gm.method1("do");		//뒤의 인풋 값으로 타입을 유추할 수 있는 경우 생략 가능
		
		System.out.println(str1);
		System.out.println(str2);
		
		Integer int1 = gm.<Integer>method1(100);
		Integer int2 = gm.method1(200);
		System.out.println(int1);
		System.out.println(int2);
		
		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		
		System.out.println("========================");
		
		//2. method2 호출
		
		//리턴 타입은 일반 타입
		boolean bool1 = gm.<Double> method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.4, 5);
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("========================");
		System.out.println(gm.<String>method2("hi","hi"));
		System.out.println(gm.method2("Hi", "hi"));
		
		System.out.println("========================");
		//3. method3 출력
		
		gm.<String, Integer> method3("kor",80);
		gm.method3("eng", 88);
		
		System.out.println("========================");
		gm.method3("Avarta2", "lotteCinema");
		gm.method3(1000, 220);
		gm.<Integer,Double> method3(1000, 31.2);
		

	}

}
