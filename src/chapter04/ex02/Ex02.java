package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * <문제>
		 * 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력
		 * 출력 : 1 월은 31일 입니다.
		 */
		Scanner sc= new Scanner(System.in); 
		int month = sc.nextInt();
		int day = 30;
		switch(month) {
		case 1 : case 3 :case 5 :case 7 :case 8 :case 10 :case 12 :
			System.out.printf("%d 월은 %d 일 입니다.\n",month,day+1);
			break;
		case 2 :
			System.out.printf("%d 월은 %d 일 입니다.\n",month,day-2);
			break;
		case 4 : case 6 :case 9 :case 11 :
			System.out.printf("%d 월은 %d 일 입니다.\n",month,day);
			break;
		default :
			System.out.println("1에서 12까지의 숫자를 입력하시오");
		}
		

	}

}
