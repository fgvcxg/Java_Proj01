package chapter04.ex01;

public class If_Control_Statement {

	public static void main(String[] args) {
		// If 구문 사용하기
		//1. type 1 : if (조건) {실행문 : 조건이 참일때 실행;}
		int value1 = 5;
		//조건이 참
		if(value1 > 3) {
			//조건이 참일때 실행 블럭
			System.out.println("실행1");
		}
		//조건이 거짓
		if(value1 < 3) {
			//조건이 참일때 실행 블럭
			System.out.println("실행2"); //조건이 거짓이므로 실행되지 않음
		}
		
		System.out.println("====={조건이 참일때 실행문} , {} 생략가능 =========");
			//if 조건에서 실행문이 1개 일때 {} 생략가능 하다
		if(value1 > 3)
			System.out.println("실행3"); //실행문 1개만 {} 가 생략되어서 처리될 수 있다.
			System.out.println("실행4");
			
		//2. Type 2 : if (조건) {조건이 참일때 실행 ;} else {조건이 거짓일때 실행;}
				//삼항 연산자료 변환
		boolean b1 = true;
		boolean b2 = false;
		if(b1) {
			//조건이 참일떄 실행
			System.out.println("참");
		}else {
			//조건이 거짓일때 실행
			System.out.println("거짓");
		}
		
		System.out.println("=====삼항 연산자를 사용해서 출력=======");
		System.out.println((b1)?"참" : "거짓");
		
		System.out.println("============if type 3============");
		
		//3. type 3 : 조건이 여러개인 경우 : 
		//if (조건1) {조건 1이 참일때 실행}else if(조건2){조건 2가 참일때 실행}... else{조건에 존재하지 않을때 실행}
		
		int value3 = 85;
		if(value3 >= 90) {
			System.out.println("A");
		}else if(value3 >= 80) {
			System.out.println("B"); //if 문을 빠져나온다. 실행후 탈출
		}else if(value3 >= 70) {
			System.out.println("C");
		}else if(value3 >= 60) {
			System.out.println("D");
		}else {
			//위에 조건이 모두 만족하지 않으면 실행
			System.out.println("F");
		}
		
		System.out.println("==========================");
		
		if(value3 >= 70) {				//실행후 탈출
			System.out.println("C");
		}else if(value3 >= 80) {
			System.out.println("B");
		}else if(value3 >= 90) {
			System.out.println("A");
		}else {
			System.out.println("F");
		}
		System.out.println("==========================");
		
		if(value3 >= 60 && value3 < 70) {
			System.out.println("D");
		}else if(value3 >= 70 && value3 < 80) {
			System.out.println("C");
		}else if(value3 >= 80 && value3 < 90) {
			System.out.println("B");
		}else if(value3 >= 90 && value3 <= 100) {
			System.out.println("A");
		}else if(value3 >= 0 && value3 < 60) {
			System.out.println("F");
		}else {
			System.out.println("정확한 점수가 아닙니다. 0~100");
		}
		

	}

}
