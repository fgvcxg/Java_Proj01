package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * <문제>
		 * switch 문을 사용하여 프로그램 하세요.
		 * 스캐너로 정수 1을 인풋받으면 " 금메달 입니다"
		 * 정수 2를 인풋 받으면 " 은메달 입니다 "
		 * 정수 3을 인풋 받으면 " 동메달 입니다 "
		 * 그 외를 인풋 받으면 "메달이 없습니다"
		 */
		Scanner sc = new Scanner(System.in);
		int medal1 = sc.nextInt();
		switch(medal1) {
		case 1 :
			System.out.println("금메달입니다");
			break;
		case 2 :
			System.out.println("은메달입니다");
			break;
		case 3 :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
			break;
		
		}
		System.out.println("===========================");
		String medal2 = sc.next();
		switch(medal2) {
		case "gold" :
			System.out.println("금메달입니다");
			break;
		case "silver" :
			System.out.println("은메달입니다");
			break;
		case "bronze" :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
			break;
		
		}
		sc.close();
		

	}

}
