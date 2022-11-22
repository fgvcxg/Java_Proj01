package chapter08.ex02;

public class Car {
	
	public String carName;
	public String carColor;
	public int maxSpeed;
	
	public Car(){}
	public Car(String carName,String carColor,int maxSpeed){
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("자동차명 : " + carName);
		System.out.println("자동차색 : " + carColor);
		System.out.println("최고속력 : " + maxSpeed);
		
	}
	

}
