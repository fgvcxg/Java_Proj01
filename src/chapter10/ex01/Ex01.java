package chapter10.ex01;

class Animal{		//Animal 클래스를 상속해서 Tiger, Eagle, Lion 클래스를 생성
						//자식 클래스에서는 필드1, 메소드1 정의
						//LionChild클래스는 Lion 클래스를 상속해서 필드1, 메소드1
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물을 먹습니다");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다");
	}
}

class Tiger extends Animal{
	int tooth;
	void hide() {
		System.out.println("호랑이 은신한다");
	}
	
}

class Eagle extends Animal{
	int wing;
	void fly() {
		System.out.println("독수리 난다");
	}
	
}

class Lion extends Animal{
	int howl;
	void walk() {
		System.out.println("사자 걷다");
	}
	
}

class LionChild extends Lion{
	int restTime;
	void growth() {
		System.out.println("아기 사자 성장한다");
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 호랑이 =========");
		Tiger t = new Tiger();
		
		t.eat();
		t.sleep();
		t.hide();
		
		t.name = "호랭이";
		t.age = 1;
		t.color = "오랜지";
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.color);
		
		System.out.println("======= 독수리 ==========");
		Eagle e = new Eagle();
		e.eat();
		e.sleep();
		e.fly();
		
		e.name = "독수리";
		e.age = 2;
		e.color = "갈색";
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.color);
		
		System.out.println("======= 사자 ===========");
		Lion l = new Lion();
		l.eat();
		l.sleep();
		l.walk();
		
		l.name = "사장";
		l.age = 3;
		l.color = "노랭이";
		System.out.println(l.name);
		System.out.println(l.age);
		System.out.println(l.color);
		
		System.out.println("======== 사자 새끼 =======");
		LionChild c = new LionChild();
		c.eat();
		c.sleep();
		c.walk();
		c.growth();
		
		c.name = "응애사자";
		c.age = 5;
		c.color = "사자색";
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.color);

	}

}
