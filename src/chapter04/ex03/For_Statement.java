package chapter04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// For 문 : 조건이 true 동안 실행 블럭을 반복해서 처리, 조건이 false 면 for 문을 빠져나온다.
		/*
		 * for(초기값 ; 조건 ; 증감식{
		 * 	실행블럭 // 조건이 true 일 동안 반복, 조건이 false 이면 빠져나온다.
		 * }
		 */
		
		// 1. FOR문의 기본 구조
		int a;						//변수를 블락밖에서 선언
		for(a=0; a<3; a++) {
			System.out.println(a);
		}				// 0, 1, 2
		System.out.println("========================");
		System.out.println();

		for(int b = 0; b < 100; b+=2) {
			System.out.print(b + " ");	//변수 : b : 지역변수 : for 블락내에서만 사용됨
			
		}
		
		System.out.println();
		System.out.println("========================");
		for(a=0; a<20; a+=3) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		for(int b = 0; b<20; b+=4) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		
		//초기값 100부터 1빼면서 조건 i > 0
		for(int i = 100; i<0 ;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		
		for(int i = 1000; i>0; i -=3) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("========================");
		
		//여러개의 변수를 초기식 및 증갑식에서 처리 가능
		for(int i = 0, j = 0; i <100; i++, j++) {
			System.out.print(i +" "+j);
		}

		System.out.println();
		System.out.println("========================");
		
		
	}

}
