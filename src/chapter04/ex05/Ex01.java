package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * <문제>	do while
		 * 스캐너를 사용해서 무한 루프를 돌립니다.
		 * 스캐너에 1을 넣으면 1.평균출력으로 출력
		 * 스캐너에 2을 넣으면 2.합계출력으로 출력
		 * 스캐너에 3을 넣으면 3.이름출력으로 출력
		 * 
		 * 스캐너에 4을 넣으면 프로그램 종료로 출력
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int a =0;				
		do{
			System.out.println("=======================");
			System.out.println("1. 평균 출력 | 2번. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("=======================");
			System.out.println("위 번호를 선택하시오 >>>");
			a=sc.nextInt();
			
			if(a==1) {
				System.out.println("1.평균 출력");
			}else if(a==2) {
				System.out.println("2.합계 출력");
			}else if(a==3) {
				System.out.println("3.이름 출력");
			}else if(a==4) {
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
			}
			
		}while(true);
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
