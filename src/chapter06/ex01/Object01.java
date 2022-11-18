package chapter06.ex01;

public class Object01 {

	public static void main(String[] args) {
		// 절차 지향 프로그램 : C
			//장점 : 성능이 매우 우수하다. OS(Windows/Linux/Unix) : c, c++
			//단점 : 프로그래밍 하기가 어렵다.
					// 유지 보수가 어렵다
		// 객체 지향 프로그램 : Java , C++
			//장점 : 모든 것들을 객체화 해서 프로그래밍한다.
					//코드가 간결해 진다.
					//문제가 생겼을때 유지보수하기가 쉽다.
					//문자가 생긴 객체만 수정
					//완성된 프로그램은 각각의 객체를 조합해서 완성
			//단점 : 성능이 절차지향보다 느릴 수 있다.
		
		//클래스(class) : 객체를 생성하기 위한 틀, 붕어빵 기계(틀)
		//객체(object) : class 를 기준으로 생성된 메모리에서 실행되는 프로그램
			//붕어빵
		
		//클래스 외부에 올 수 있는 3가지:
			//- 패키지 : 클래스를 조직화하는 폴더
			//- import : 동일한 패키지에 존재하지 않는 클래스는 import
			//- 외부 클래스 : 
		
		//클래스 내부에 올 수 있는 4가지
			//- 필드 (멤버변수) : 클래스블락에 선언된 변수를 필드라 한다
					//메소드내에서 선언한 변수를 지역변수
			//- 메소드 : 함수를 객체 지향 언어에서는 메소드라 호칭
				//void main(){
				//}
			//- 생성자 : 객체를 생성할 때 필드의 값을 초기화 시켜주는 작업
				//리턴 타입이 있으면 안됨.
				//객체이름과 동일한 이름의 메소드
			//내부 클래스 : 클래스 내부의 클래스 (Inner Class)

	}

}
