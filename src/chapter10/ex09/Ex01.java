package chapter10.ex09;

class Car{
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	Car(){}
	Car(String carName, String carColor, int maxSpeed, String carModel){
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본 생성자, 인풋을 받는 생성자
		//2. getter, setter
		//3. toString() 재정의 : 전체 메모리 내용 출력
		
		//4. 생성자를 통해서 값을 할당후 메모리의 전체 내용 출력
		//5. setter 를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력
		//6. getter 를 사용해서 각 필드의 내용을 출력

		Car a1 = new Car("현대","검정",100,"그랜져");
		System.out.println(a1);
		System.out.println("===================");
		
		Car a2 = new Car();
		a2.setCarName("기아");
		a2.setCarColor("흰색");
		a2.setCarModel("K9");
		a2.setMaxSpeed(110);
		System.out.println(a2);
		System.out.println("===================");
		
		
		System.out.println(a2.getCarColor());
		System.out.println(a2.getCarModel());
		System.out.println(a2.getCarName());
		System.out.println(a2.getMaxSpeed());
		
		
		
	}

}
