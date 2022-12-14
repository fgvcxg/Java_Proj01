package chapter11.ex04;

abstract class Animal {		//추상 클래스, 추상 메소드가 1라도 있으면 추상 클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}

class Cat extends Animal{	//콘크리트 클래스 : 추상 메소드를 모두 구현한 메소드
	
	
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");
		
	}
	@Override
	void run() {
		System.out.println("고양이는 달린다");
		
	}
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
	
}

abstract class Dog extends Animal{	//추상 클래스의 추상 메소드를 일부만 구현한 경우 : 추상 클래스
	@Override
	void eat() {
		System.out.println("개는 고기 먹는다");
		
	}
	@Override
	void cry() {
		System.out.println("개는 멍멍");
		
	}
	
}

class DogChild extends Dog{	
	//콘크리트 클래스 : Animal에 있는 추상 클래스가 부모에서 내려오면서 완전하게 구현이 되었을때는 콘크리트 클래스가 된다
	@Override
	void run() {
		System.out.println("강아지는 깡총");
		
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못한다. 타입으로 지정은 가능하다
		// Animal, Dog 는 추상 클래스이므로 객체 생성이 안된다.
		
		//1. Animal 객체 생성
		
		//Animal a1 = new Animal();	//오류 발생 : 추상 클래스는 객체화 하지 못한다.
		
		//Cat()을 객체화 해서 Animal 타입으로 정의,
		// Animal 의 메소드 호출시 오버라이딩된 Cat의 메소드 호출
		Animal a2 = new Cat();
		a2.eat();
		a2.cry();
		a2.run();
		
		System.out.println("==================");
		//Cat 객체화 해서 Cat 타입으로 지정
		Cat c2 = new Cat();
		c2.cry();
		c2.eat();
		c2.run();
		
		System.out.println("==================");
		//Dog 는 추상클래스 이므로 객체화 할 수 없다
		//Dog d1 = new Dog(); 	//오류 발생
		
		//DogChild를 객체화 해서 Animal 타입으로 지정
		Animal a3 = new DogChild();
		a3.cry();	//Dog
		a3.run();	//DogChild
		a3.eat();	//Dog
		
		System.out.println("==================");
		//DogChild 를 객체화 해서 Dog 타입으로 지정
		Dog d3 = new DogChild();
		d3.cry();
		d3.run();
		d3.eat();
		
		System.out.println("==================");
		//DogChild 를 객체화 해서 DogChild 타입으로 지정
		DogChild dh1 = new DogChild();
		dh1.cry();
		dh1.run();
		dh1.eat();

	}

}
