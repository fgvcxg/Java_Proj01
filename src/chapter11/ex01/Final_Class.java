package chapter11.ex01;

class Aaa{
	int m;
	final int n;
	
	Aaa () {
		n=10;
	}
	
	Aaa(int n){
		this.n = n;
	}
	
	void run() {
		System.out.println("Aaa 클래스의 run() 입니다");
	}
}

final class Bbb extends Aaa{		//상속이 불가한 클래스.
	//상수값은 값이 할당이 되어 있어야한다.
	//자식은 기본 생성자를 호출하기에 부모 클래스에서 기본 생성자를 호출해줘야 한다.
}

//상속 불가
//class Ccc extends Bbb{
//	
//}

public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
