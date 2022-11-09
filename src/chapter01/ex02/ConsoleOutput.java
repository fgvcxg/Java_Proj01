package chapter01.ex02;

public class ConsoleOutput {

	public static void main(String[] args) {
		// 콘솔에서 다양한 출력 방법
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요"); //문자열 + 문자열 : + 연결 연산자
		
		System.out.println(2 + 4); // => 6
		
		System.out.println(4.6);
		
		System.out.println("문자" + 1); 
		// + : 문자열 연결, 1이 문자열로 변환 => 문자 1
		
		System.out.println("2" + "4");
		
		System.out.println("문자" + 1 + 2);
		// "" 뒤에 있는 숫자는 모두 문자로 변경된다 => 문자12
		
		System.out.println(1 + 2 + "문자");
		// 숫자가 먼저 있기에 연산 후에 문자와 더해진다 => 3문자
		
		System.out.println("==========변수에 값을 할당 후 출력==========");
		
		//변수 선언 : 자료형 변수명 = 변수의 값
		int a = 5; //정수형 a 변수에 정수값 5를 넣어라
					// = : 오른쪽의 값을 왼쪽 변수에 할당해라.
					// == : 오른쪽과 왼쪽이 같다.
		System.out.println(a); // 변수를 출력 할 때는 " " 를 넣으면 안됨
		
		String b = "하세요" ;
		System.out.println(b);
		System.out.println("안녕" + b);
		System.out.println(a + "안녕" + b);
		
		System.out.println("=========================");
		
		System.out.print("반갑");
		System.out.print("습니다\n");
		// \n : 엔터, \t : 탭
		
		System.out.print(7 + "\n");
		System.out.print("안녕 \t" + "하세요.  \n");
		System.out.print("반갑 \t" + "습니다. \n");
		
		
		System.out.println("=========================");
		
		// %d : 뒤에 정수를 불러올때 사용(10진수)
		System.out.printf("오늘의 날짜는 %d월 %d일 입니다\n", 11, 07);
		
		// %o : 뒤에 값을 8진수 값을 불러올때 사용
		System.out.printf("8진수 10을 불러옵니다 : %o \n", 10);
		
		// %x : 뒤에 값을 16진수로 불러온다		
		System.out.printf("16진수 10을 불러옵니다 : %x \n" , 10);
		
		// %s : 뒤에 문자열을 가지고 옵니다.
		System.out.printf("%s은 %s가 매우매우 %s니다 \n", "오늘", "날씨", "맑습");
				
		// %f : 문자열 뒤에 실수 값을 불러올때 사용
		// %4.2f : 4: 전체 4자리, 2소숫점이하 2자리까지 잘라서 출력
		System.out.printf("나의 몸무게는 %f입니다. \n" , 75.1234567);
		System.out.printf("나의 몸무게는 %4.2f입니다.\n" , 75.1234567);
		
		System.out.printf("오늘의 온도는 %f도 이고 %s %f 입니다", 17.33 ,"나의 몸무게는" , 90.6);
		
	}

}
