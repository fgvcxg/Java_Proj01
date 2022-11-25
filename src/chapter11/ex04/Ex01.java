package chapter11.ex04;

abstract class Car {		//트럭, 자가용, 굴삭기
	abstract void run();
	abstract void eat();
}

class Truck extends Car{
	
	void run() {
		System.out.println("트럭은 달린다");
	}
	void eat() {
		System.out.println("트럭은 경유지");
	}
}
class Sedan extends Car{
	
	void run() {
		System.out.println("세단은 달린다");
	}
	void eat() {
		System.out.println("세단은 휘발유");
	}
}
class Excavators extends Car{
	
	void run() {
		System.out.println("굴삭기는 달린다");
	}
	void eat() {
		System.out.println("굴삭기는 경유");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Truck();
		Car c2 = new Sedan();
		Car c3 = new Excavators();
		
		c1.run();
		c1.eat();
		System.out.println("===============");
		
		c2.run();
		c2.eat();
		System.out.println("===============");
		
		c3.run();
		c3.eat();

	}

}
