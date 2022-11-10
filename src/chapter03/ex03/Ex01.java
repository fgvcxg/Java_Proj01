package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <<실습 문제>>
		// 정수 2개를 scanner 로 인풋 받고 두 값이 같으면 true 를 출력 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true 를 출력 다르면 false 출력
			// 등가연산자 사용
			// 기본자료형 : ==
		int a, b;
			// 참조자료향 : aName.equals(bName)
		String aName, bName;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a==b);
		
		aName = sc.next();
		bName = sc.next();
		System.out.println(aName.equals(bName));
		
		
		

	}

}
