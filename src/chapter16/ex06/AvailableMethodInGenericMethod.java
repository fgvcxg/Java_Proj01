package chapter16.ex06;

class A {
	public <T> void method (T t) {
		//제너릭 메소드 내부에서 사용가능한 메소드는 Object의 메소드만 사용가능하다.
		//단, 제너릭에 들어오는 타입의 제한이 적용된 경우는 해당메소드를 사용할 수 있다
		
//		System.out.println(t.length());	//length() 메소드는 String 클래스안에 있는 메소드
		
		System.out.println(t.equals("hi")); 	//equals() : Object 클래스의 메소드
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi how are you doing?".length());
		
		A a = new A();
		a.<String>method("hi");
		a.method("hi");
		a.method("df");

	}

}
