package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다.
		// 변수 이름 지정
		// 변수명은 소문자로 시작(권고), 클래스명은 대문자로 시작(필수)
		// 변수명으로 한글을 사용할 수 있다.(권장하지 않는다.)
		// 변수명으로 특수문자는 _, $만 사용 가능
		// 변수명으로 숫자는 사용 가능하나 변수명 첫자리에 숫자가 오면 오류
		// 변수명으로 자바에서 사용하는 예약어(pakage, class, public ... )
		
		
		boolean aBcD; //boolean : true, false 만 넣을 수 있다.
		aBcD = true;
		aBcD = false;
		
		byte 가나다라;
		short _abcd;
		boolean $_abcd;
		long adcd3;
		char a3cd;
		//double int  // 자바에서 사용되는 예약어는 사용할 수 없다.
		//int my work; 변수명으로 공백은 올 수 없다.
		int mywork;
		String myClassName; //권장 사항(단어를 이을땐 대문자로)
		
		//상수 : 값을 넣을면 그 값을 변화 하지 못하도록 설정
		// 변수 자료형 앞에 final 키가 붙으면 상수가 된다
		// 상수명은 전체를 대문자로 지정(권장)
		
		final double PI = 3.141952; //상수는 값을 넣으면 수정할 수 없다
		System.out.println(PI); 

	}

}
