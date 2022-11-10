package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 *<<문제>> 스캐너를 등록하고
		 *어머님이름 아버님이름 형제이름 자신이름
		 *어머님 나이 아버님 나이 형제나이 자신나이
		 *
		 *콘솔에서 인풋받은 이름은 모두 출력
		 *나이의 합계와 평균을 출력
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		String myName;
		String fName;
		String mName;
		String sName;
		int myAge;
		int fAge;
		int mAge;
		int sAge;
		
		
		System.out.println("어머니의 이름 >> ");
		mName=sc.next();
		System.out.println("아버지의 이름 >> ");
		fName=sc.next();
		System.out.println("나의 이름 >> ");
		myName=sc.next();
		System.out.println("형제의 이름 >> ");
		sName=sc.next();
		System.out.println("어머니의 나이 >> ");
		mAge=sc.nextInt();
		System.out.println("아버지의 나이 >> ");
		fAge=sc.nextInt();
		System.out.println("나의 나이 >> ");
		myAge=sc.nextInt();
		System.out.println("형제의 나이 >> ");
		sAge=sc.nextInt();
		
		
		System.out.println("어머니의 이름은" + mName);
		System.out.println("아버지의 이름은" + fName);
		System.out.println("나의 이름은" + myName);
		System.out.println("형제의 이름은" + sName);
		
		int sum = mAge + fAge + myAge + sAge;
		double avg = sum/4.0;
		
		System.out.printf("나이의 합은 %d 입니다\n" , sum);
		System.out.printf("나이의 평균은 %f 입니다 \n", avg);

	}

}
