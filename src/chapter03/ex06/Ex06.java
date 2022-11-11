package chapter03.ex06;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		//<문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수 값이 홀수 이면 "홀수"라고 출력하고
				//인풋 받은 값이 짝수이면 "짝수"라고 출력
		
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		a = sc.nextInt();
		b = (a%2==0) ? "짝수" : "홀수";
		System.out.println(b);
		
	}

}
