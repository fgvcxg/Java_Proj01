package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// While 문 : 반복문, 조건이 true 동안 반복, 조건이 false 이면 실행 블락을 빠져나온다.
		
		/*
		 * for(초기식 ; 조건 ; 증감식){
		 * 실행블럭;
		 * }
		 */
		
		/*
		 * 초기값
		 * while(조건){
		 * 실행블럭;
		 * 증감식;
		 * }
		 * 
		 */
		
		//1.While 문의 기본 문법 구조(증감식을 처리하지 않으면 무한 루프)
		System.out.println("=========while  문으로 출력=========");
		int a = 0;
		while(a <10 ) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		//2.For 문으로 변환
		System.out.println("=========for  문으로 출력=========");
		for(a=0;a<10;a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("=====================");
		
		//while 문 vs for 문
		//100부터 1까지 2씩 감소해서 출력
		
		int i=100;
		while(i > 0) {
			System.out.print(i +" ");
			i -=2;
		}
		System.out.println();
		
		for(i=100;i>0;i-=2) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("=============while 문에서 무한 루프===============");
		
		boolean ab = true;
		int d = 0; 	//기본자료형은 반드시 초기 값이 할당 되어 있어야 한다.
		while(ab) {
			System.out.println("무한 루프" + d);
			
			if(d>5) {
				break;
			}
			
			d++;
		}
		

	}

}
