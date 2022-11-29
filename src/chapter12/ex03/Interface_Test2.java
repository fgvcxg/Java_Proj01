package chapter12.ex03;

interface Animal1{
	void cry();
}
interface Animal2{
	void run();
}
interface Animal3{
	void eat();
}

//interface extends interface
//앞과 뒤가 동일한 타입일 경우는 extends를 사용한다
//바로 아래는 k와 Animal1이 둘다 인터페이스이기 때문에 extends를 사용한다
interface k extends Animal1, Animal2, Animal3 {
	
}

class G implements k{
	
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
	
}


class Aa{
	void abc() {
		System.out.println("Aa의 abc()");
	}
}
abstract class Bb{
	abstract void bcd();
}

//extends 키 다음에는 1개의 클래스만 올 수 있다	//클래스는 하나의 부모만 가진다
//implement 키 다음에는 여러개의 인터페이스가 올 수 있다.	//인터페이스는 다중 상속이 가능
	//class Cc extends Aa,Bb{ <=== 상속은 1개만 가능
//extends 가 먼저 오고 implements : 순서가 바뀌면 안됨
class Cc extends Bb implements Animal1, Animal2, Animal3{
	
	@Override
	void bcd() {}
	
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
	
}

public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
