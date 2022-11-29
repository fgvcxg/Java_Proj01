package chapter12.ex04;

interface Animal1 extends Animal {
	void cry();
}
interface Animal2 extends Animal {
	void run();
}
interface Animal3 extends Animal {
	void eat();
}
interface Animal{
	
}

//Cat, Tiger <== cry, run
//Dog, Lion  <== run, eat
//Eagle <=== cry, run, eat

//배열에 넣어서 오버라이딩된 메소드 출력
	//instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry, run
 	//instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat, run
	//instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry, run, eat
class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("고양이는 뛴다");	
	}
	
}
class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 뛴다");	
	}
	
}
class Dog implements Animal3, Animal2{
	@Override
	public void eat() {
		System.out.println("개사료");
	}
	@Override
	public void run() {
		System.out.println("개는 뛴다");	
	}
	
}
class Lion implements Animal3, Animal2{
	@Override
	public void eat() {
		System.out.println("사자식 고기");
	}
	@Override
	public void run() {
		System.out.println("사자는 뛴다");	
	}
	
}

class Eagle implements Animal3, Animal2, Animal1{
	@Override
	public void eat() {
		System.out.println("독수리 먹이");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날지");	
	}
	@Override
	public void cry() {
		System.out.println("독수리 크앙");	
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		

		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		
		Animal[] arr = new Animal[] {a1,a2,a3,a4,a5};
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] instanceof Cat || arr[i] instanceof Tiger) {
				((Animal1) arr[i]).cry();
				((Animal2) arr[i]).run();
				System.out.println();
			}else if(arr[i] instanceof Dog || arr[i] instanceof Lion)  {
				((Animal3) arr[i]).eat();
				((Animal2) arr[i]).run();
				System.out.println();
			}else if(arr[i] instanceof Eagle) {
				((Animal1) arr[i]).cry();
				((Animal2) arr[i]).run();
				((Animal3) arr[i]).eat();
				System.out.println();
			}
		}

		

	}

}
