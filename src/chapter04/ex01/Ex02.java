package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.
		System.out.println("=========================================");
		System.out.println("1.학점의 합계 / 평균 | 2. 홀/짝 | 3. 같은 이름식별");
		System.out.println("=========================================");
		System.out.println("위의 번호를 선택하세요");
		
		int select;
		
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		if(select==1) {
			int kor, eng, math;
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum/3.0;
			System.out.printf("학점의 합계는 %d, 학접의 평균은 %f\n",sum, avg);			
			
		}else if(select == 2) {
			int a = sc.nextInt();
			System.out.printf((a%2==0)?"짝수\n" : "홀수\n");
			
		}else if(select == 3) {
			String n1, n2;
			n1 = sc.next();
			n2 = sc.next();
			System.out.println((n1.equals(n2))?"같은 이름 입니다" : "다른 이름 입니다");
			
		}else {
			System.out.println("1에서 3까지의 값만 입력 하시오");
		}

	}

}
