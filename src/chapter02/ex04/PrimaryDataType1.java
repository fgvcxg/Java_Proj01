package chapter02.ex04;

public class PrimaryDataType1 {

	public static void main(String[] args) {
		// 자료형 : 변수명 앞에 반드시 선언, 변수에 어떤 값을 넣을지 지정
		// 기본 자료형 : boolean, byte, short, int, long, float, double
			// 메모리의 Stack 공간에 저장, 변수명 : 값 (같이 저장이 된다)
		
		// 참조 자료형 : String, 배열, 객체 ... 무한대로 생성가능
			// 메모리의 Heap 공간에 변수의 값이 저장됨, 
			//       Stack 공간에는 변수명 : Heap의 값의 주소값을 가지고 있다.
		
		// 1. boolean : true, false
		boolean bool1 = true;
		boolean bool2;
		bool2 = false;
		System.out.println(bool1); // true
		System.out.println(bool2); // false
		
		// 2. 정수 (byte : 1byte, short : 2byte, int : 4byte, long : 8byte)
			// byte :(1byte = 8bit) : -2^7 ~ 2^7-1 : -128 ~ 127
				// byte value1 = -129; // 범위를 넘어가기에 오류가 나온다
			
			// short :(2byte = 16bit) : -2^15 ~ 2^15-1 : -32,768~32,767
		
			// int : (4byte = 32bit) : -2^31 ~ 2^31-1 : -8,388,608 ~ 8,388,607
		
			// long : (8byte = 64bit) : -2^63 ~ 2^63-1
				// long 의 변수에 값을 할당 할때는 l , L 을 붙여 줘야 한다
				// 붙여 주지 않으면 기본적으로 int 형으로 값이 저장됨.
			long value7 = 1000; // int 형으로 저장
			long value8 = 1000L; // long 형으로 저장
		
		// 3. 실수 (float : 정밀도 7자리(4byte), double : 정밀도 15자리(8byte)
			// 실수의 기본은 double
			// float : float 으로 지정된 변수의 값을 할당할 때 리터널에 f, F 명시를 해야 한다.
			float value9 = 1.2F; // 보통 대문자로 넣어준다
			
		// 4. 문자 (char) : 영문/한글/일본어..., 숫자, 특수 문자, 한 글자
			// 변수의 값을 할당할 리터럴에 ' '
				// 1. char 자료형 변수에 직접 문자로 지정하는 방법
			char value10 = 'a';
			char value11 = '없';
			char value12 = '3';
			char value13 = '$';
			
				// 2. 정수값으로 문자를 저장하는 방법 : 아스키 코드 값으로 문자를 저장
			char value15 = 65; 	//A
			char value16 = 0xac00; // 0x : 16진수, 0 : 8진수, 0b : 2진수
							//가
			char value17 = 51;	//3
			
			System.out.println(value15);
			System.out.println(value16);
			System.out.println(value17);
			
			System.out.println("======================");
			
				// 3. 유니코드로 저장하는 방법 : 전 세계의 모든 글자를 3byte 로 저장
			char value18 = '\u0041';  	// A
			char value19 = '\uac00';	// 가
			char value20 = '\u0033';	// 3
			
			System.out.println(value18);
			System.out.println(value19);
			System.out.println(value20);
			
			/*
			 <문제>
			 */
			char aa = '\uC774';	//성 유니코드
			char bb = '\uC900';	//이름1
			char cc = '\uD638';	//이름2
	
			
			System.out.printf("%s %s %s \n", aa, bb, cc);
			
			
		// 5. 문자열 (String) : 여러 글자를 담을 수 있다.
				//기본 자료형이 아니다. 참조 자료형(객체)
			// 변수의 값을 할당할 리터럴에 " "
			
		String value21 = "안녕하세요. 오늘의 날씨는 매우 맑습니다";
		System.out.println(value21);
		
		
		
	}

}
