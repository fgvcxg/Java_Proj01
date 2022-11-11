package chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자
			//(조건) ? 참 : 거짓 : 조건이 참일때 앞을 실행하고 조건이 거짓일때 뒤를 실행한다
		
		int value1 = ( 3 > 5 ) ? 6:9;
			//조건이 false 이므로 9가 value1에 들어감
		
		System.out.println(value1);

		int value2 = ( 2 < 5 ) ? 6 : 9;
			//조건이 true 이므로 6이 value2에 들어감
		System.out.println(value2);
		
		
		
	}

}
