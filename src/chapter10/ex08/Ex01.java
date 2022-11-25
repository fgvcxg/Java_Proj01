package chapter10.ex08;


class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다");
	}
}
class Man extends Animal{
	@Override
	void run() {
		System.out.println("남자는 달린다");
	}
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println("여자는 달린다");
	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println("사자는 달린다");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 달린다");
	}
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println("고양이는 달린다");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 달린다");
	}
}
class DogChild extends Dog{
	@Override
	void run() {
		System.out.println("강아지는 달린다");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// Animal : 부모클래스, run()정의
		// 자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog, DogChild	<== 다형성
		//	- 부모의 run 메소드를 재정의
		//	arr 배열에 저장후
		
		Animal a1 = new Animal();
		Animal a2 = new Man(); 
		Animal a3 = new Woman();
		Animal a4 = new Lion();
		Animal a5 = new Tiger();
		Animal a6 = new Cat();
		Animal a7 = new Dog();
		Animal a8 = new DogChild();
		
		Animal arr[] = new Animal[] {a1,a2,a3,a4,a5,a6,a7,a8};
		
		System.out.println("===== For ============");
		for(int i =0 ; i<arr.length;i++) {
			arr[i].run();
		}
		
		System.out.println("===== Enhanced For ============");
		for(Animal k : arr) {
			k.run();
		}
		
		
	

	}

}
