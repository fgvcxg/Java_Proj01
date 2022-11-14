package chapter04.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) {
		/*
		 * do ~ whlie 문 : 실행문을 조건과 상관 없이 1번은 실행 시킨후 조건에 따라 반복
		 * while 문 : 조건에 맞아야 실행문을 실행
		 * 
		 * 초기식
		 * whlie(조건){    //조건이 ture 일때 실행
		 * 		실행블럭;
		 * 		증감식;
		 * }
		 * 
		 * 
		 * 초기식
		 * do{
		 * 		실행블럭;
		 * 		증감식;
		 * }whlie(조건);		//	무조건 실행을 한번 하고 나서 조건을 봄
		 * 
		 */
		
		//1. while 문
		System.out.println("====== while 문 ========");
		int a=0 ;
		while(a < 0) {		//조건이 false 이므로 실행블락이 실행 안됨
			System.out.println(a+" ");			
		}
		
		//2. do while 문
		System.out.println(" do while 문");
		a=0;
		do {
			System.out.println(a +" ");
		}while(a <0 );		//조건과 상관없이 실행문을 반드시 1번은 실행됨
		
		//3. 반복 횟수가 10번인 경우 while 문과 do while 문 비교
		
		System.out.println(" == while 문을 사용해서 10번 출력 ");
		a = 0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		System.out.println(" == do while 문을 사용해서 10번 출력 ");
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<10);

	}

}
