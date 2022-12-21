package chapter16.ex07;

abstract class Fruit{
	abstract void print();	//추상 메소드, 객체의 필드 정보를 출력
}
class Apple extends Fruit{
	
	private String name;
	private int price;	
	
	//print 메소드 오버라이딩 해서 필드의 정보를 출력
	@Override
	void print() {System.out.printf("%s : %d\n",name,price);}
	
	//getter, setter를 통해서 인풋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Banana extends Fruit{
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {System.out.printf("%s : %d\n",name,price);}
	
}

//Fruit 을 상속하지 않았기 때문에 제너릭 타입으로 저장이 불가
class Pencil{
	private String name;
	private int price;
	
	public Pencil(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void print() {System.out.printf("%s : %d\n",name,price);}
	
}

//제너릭 클래스 : Fruit 만 저장할 수 있는 제너릭 클래스
class GenericClass < T extends Fruit>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		GenericClass<Apple> g1 = new GenericClass();
		GenericClass<Banana> g2 = new GenericClass();
		
		g1.setT(new Apple());
		g2.setT(new Banana());
		
		g1.getT().setName("Apple");
		g1.getT().setPrice(1000);
		
		g2.getT().setName("Banana");
		g2.getT().setPrice(2000);
		
		g1.getT().print();
		g2.getT().print();
		
		System.out.println("===================");
	//	GenericClass<Pencil> p1 = new GenericClass();
		//Generic 클래스에 포함이 되어 있지 않기 때문에 오류가 남
		//그래서 따로 생성자를 통해 호출함
		
		Pencil p1 = new Pencil("Pencil",5000);
		p1.print();
	

	}

}
