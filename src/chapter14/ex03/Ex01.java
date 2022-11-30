package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고,
			//각각의 예외에 대해서 catch
			//3개의 예외를 한꺼번에 처리
		
		
		int[] arr = new int[] {1,2,3};
		try {
			System.out.println(3/0);
			
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
			
		} catch (ArithmeticException e) {
			System.out.println(" ArithmeticException  오류발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException  오류발생");
		} catch (NumberFormatException e) {
			System.out.println(" NumberFormatException  오류발생");
		} finally {
			System.out.println("첫번째 프로그램 종료");
		}
		
		
		
		try {
			System.out.println(3/0);
			
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException  e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("두번째 프로그램 종료");
		}
		

	}

}
