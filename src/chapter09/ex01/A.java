package chapter09.ex01;

public class A {
	
	
	//필드 이름 앞에 접근 제어자
	public int a =1;		//외부 패키지에서 접근이 가능
	protected int b =2;		//외부 패지키에서 접근이 가능(상속 관계일때만 가능)
	int c = 3;				//default : 같은 패키지 내에서 접근 가능
	private int d = 4;		//동일한 파일에서만 접근이 가능
	
	public A () {}
	
	public void adb() {
		System.out.println("public");
	}
	protected void bcd() {
		System.out.println("protected");
	}
	void cbe() {
		System.out.println("default");
	}
	private void def() {
		System.out.println("private");
	}
	
	
	
	

}
