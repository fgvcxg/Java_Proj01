package chapter04.ex06;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for 구문을 사용해서 출력하세요.
		
		
		
		Scanner sc = new Scanner(System.in);
		int a =0;				
		do{
			System.out.println("=======================");
			System.out.println("1. 구구단 출력 | 2번. 19단 출력 | 3. 19단중 7의 배수 출력 | 4. 프로그램 종료");
			System.out.println("=======================");
			System.out.println("위 번호를 선택하시오 >>>");
			a=sc.nextInt();
			
			if(a==1) {
				System.out.println("1.구구단 출력");
				for(int i =1;i<10;i++) {
					for(int j=1;j<10;j++) {
						System.out.printf("%d * %d = %d\n",i,j,i*j);
					}
				}
			}else if(a==2) {
				System.out.println("2.19단 출력");
				for(int i =1;i<20;i++) {
					for(int j=1;j<20;j++) {
						System.out.printf("%d * %d = %d\n",i,j,i*j);
					}
				}
			}else if(a==3) {
				System.out.println("3.19단중 7의 배수 출력");
				for(int i =1;i<20;i++) {
					if(i%7==0) {
					for(int j=1;j<20;j++) {
						System.out.printf("%d * %d = %d\n",i,j,i*j);
					}
					}
				}
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
