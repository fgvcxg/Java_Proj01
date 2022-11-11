package chapter03.ex06;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>
		// 스캐너로 3 6 9의 배수이면 " 3 6 9의 배수입니다"
		// 그렇지 않으면 3 6 9 의 배수가 아니면 " 3 6 9 의 배수가 아닙니다 "
		
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		a = sc.nextInt();
		b = (a%3==0 || a%6==0 || a%9==0)? "3 6 9의 배수입니다" : "3 6 9의 배수가 아닙니다";
		System.out.println(b);
	}

}
