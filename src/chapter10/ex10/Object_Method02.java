package chapter10.ex10;

class Aa{		//equals() 가 정의 되어 있지 않은 클래스
				// Object 클래스의 equals() 메소드는 stack의 참조 주소를 비교하도록 되어 있다.
	String name;
	
	Aa(String name){
		this.name = name;
	}
}

class Bb{
	//필드1
	String name;
	
	Bb(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class Object_Method02 {

	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 : 기본적으로 == 참조 주소를 비교함
			// 객체의 Heap 의 값을 비교하는 것이 아니라 Stack 메모리의 참조주소 값을 비교
		//String 클래스는 equals()메소드가 재정의 되어 있어서 Heap의 값을 비교하도록 설정되어 있다
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		// == : 참조 자료형에서는 stack 영역의 참조 주소를 비교
		// equals() : ==
			//String 클래스는 equals() 메소드가 재정의 : Heap 의 값을 비교하도록 설정
		System.out.println(s1 == s2);		//Stack의 참조 주소를 비교, false
		System.out.println(s1.equals(s2)); 	//Heap의 값을 비교, true
			//string 클래스는oBject 의 equals() 재정의 되어 있다.
		
		System.out.println("===========");
		Aa a1 = new Aa("안녕");
		Aa a2 = new Aa("안녕");
		System.out.println(a1 == a2);		//stack 참조 주소 비교, false
		System.out.println(a1.equals(a2));	//stack 참조 주소 비교, false
									// Heap에 있는 것을 비교 하려면 따로 재정의를 해줘야 한다.
									// 그것을 재정의한 것이 Bb 클래스이다
		
		System.out.println("===========");
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		System.out.println(b1 == b2);		//stack 참조 주소 비교, false
		System.out.println(b1.equals(b2));	//Heap , name 필드의 값을 비교하도록 재정의
						//true
		
	}

}
