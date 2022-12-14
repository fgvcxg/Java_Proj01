package chapter14.ex03;

public class Multi_Catch01 {

	public static void main(String[] args) {
		// 여러 예외가 동시에 발생된 경우 처리
		
		//1. 두개의 Exception을 각각 try ~ catch 로 처리
		try {
			System.out.println(3/0);	//실행시 예외 발생 : ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌수 없습니다");
		}finally {
			System.out.println("첫번째 프로그램 실행 종료");
			System.out.println("======================");
		}
		
		
		try {
			int num1 = Integer.parseInt("10a");	//실행시 예외 발생 : NumberFormatException

		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀 수 없습니다");
		}finally {
			System.out.println("두번째 프로그램 실행 종료");
			System.out.println("======================");
		}
		
		System.out.println("====== 2번째 방법 ========");
		
		//2. 하나의 try ~ catch 에서 한꺼번에 처리
		try {
			System.out.println(3/0);	//실행시 예외 발생 : ArithmeticException			
			int num2 = Integer.parseInt("10a");	//실행시 예외 발생 : NumberFormatException
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌수 없습니다");
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀 수 없습니다");
		} finally {
			System.out.println("세번쨰 프로그램 실행 종료");
		}
		
		System.out.println("====== 3번째 방법 ========");
		//3. 하나의 try ~ catch 에서 한번에 처리
			//두 예외를 하나로 처리해도 문제가 없을때
		
		try {
			System.out.println(3/0);	//실행시 예외 발생 : ArithmeticException			
			int num2 = Integer.parseInt("10a");	//실행시 예외 발생 : NumberFormatException
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("두개의 예외가 한꺼번에 발생되었습니다");
		} finally {
			System.out.println("네번쨰 프로그램 실행 종료");
		}
		

	}

}
