package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
}

class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.stop();
		c1.start();
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//4번째 방법으로 출력, Car 클래스의 abc(), 메소드의 매개변수에 구현한 코드 만들어서 호출
		
		CarPlay c1 = new CarPlay();
		c1.abc(new Car() {
			@Override
			public void run() {System.out.println("달려요");}
			@Override
			public void start() {System.out.println("시동켜요");}
			@Override
			public void stop() {System.out.println("멈춰요");}
		});
		
		
		
	}

}
